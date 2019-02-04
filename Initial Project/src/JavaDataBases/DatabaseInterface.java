package JavaDataBases;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DatabaseInterface implements ActionListener {
	static Connection conn;
	static Statement stmt;
	static int regestrationNumber, currentGrade;
	static String studentName;
	Label l1, l2, l3, l4, l5, l6, l7;
	Frame f1;
	Button b1;
	TextField tf1, tf2, tf3;
	GridLayout g1;

	DatabaseInterface() {
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
		b1 = new Button("Save");
		b1.addActionListener(this);
		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		GridLayout g1 = new GridLayout(4, 3, 20, 20);
		f1.setLayout(g1);
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

		if (tf1.getText().equals(""))
		{
			l4.setText("MISSING");
		}
		else {
			l4.setText("");
		}

		if (tf2.getText().equals(""))
		{
			l5.setText("MISSING");
		}
		else {
			l5.setText("");

		}

		if (tf3.getText().equals(""))	{
			l6.setText("MISSING");

		}
		else {
			l6.setText("");

		}
		if ((tf1.getText().equals("")) & (tf2.getText().equals("")) & (tf3.getText().equals(""))) {
			l4.setText("MISSING");
			l5.setText("MISSING");
			l5.setText("MISSING");
		}
		else {
			try {
				regestrationNumber = Integer.parseInt(tf1.getText());
				studentName = tf2.getText();
				currentGrade = Integer.parseInt(tf3.getText()); 
				stmt.executeUpdate("INSERT INTO school VALUES('" + regestrationNumber + "','" + studentName + "','" + currentGrade + "')");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {


		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/thomasdatabase","root","");
			stmt = conn.createStatement();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		DatabaseInterface go = new DatabaseInterface();
	}


}

