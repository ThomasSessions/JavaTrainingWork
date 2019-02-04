package JavaDataBases;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DatabaseScroller implements ActionListener {
	static Connection conn;
	static Statement stmt;
	static ResultSet rec;
	static int regestrationNumber;
	static int currentGrade;
	static String studentName;
	static int i = 1;
	Label l1, l2, l3, l4, l5, l6, l7, l8;
	Frame f1;
	Button b1;
	TextField tf1, tf2, tf3;
	GridLayout g1;

	DatabaseScroller() {
		f1 = new Frame("Database information");
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		f1.setLayout(new FlowLayout());
		l1 = new Label("RegNo");
		l2 = new Label("Name");
		l3 = new Label("Grade");
		l4 = new Label("");
		l5 = new Label("");
		l6 = new Label("");
		l7 = new Label("");
		b1 = new Button("Next");
		l8 = new Label("");
		b1.addActionListener(this);
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		GridLayout g1 = new GridLayout(4, 3, 20, 20);
		f1.setLayout(g1);
		f1.add(l8);
		f1.add(l1);
		f1.add(tf1);
		f1.add(l4);
		f1.add(l2);
		f1.add(tf2);
		f1.add(l5);
		f1.add(l3);
		f1.add(tf3);
		f1.add(l6);
		f1.add(l7);
		f1.add(b1);
		f1.setSize(300, 300);
		f1.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {	
			if(rec.next()) {
				regestrationNumber = rec.getInt(i);
				studentName = rec.getString(i + 1);
				currentGrade = rec.getInt(i + 2);
				tf1.setText(regestrationNumber+"");
				tf2.setText(studentName);
				tf3.setText(currentGrade+"");
			}
			else {
				l4.setText("END");
				l5.setText("OF");
				l6.setText("DATA");
			}
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	public static void main(String[] args) {


		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/thomasdatabase","root","");
			stmt = conn.createStatement();
			rec = stmt.executeQuery("SELECT * FROM SCHOOL");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		DatabaseScroller go = new DatabaseScroller();
	}


}

