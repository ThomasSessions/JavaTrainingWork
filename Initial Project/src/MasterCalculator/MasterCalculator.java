package MasterCalculator;

import java.awt.*;
import java.awt.event.*;

public class MasterCalculator implements ActionListener {
	int c, result;
	String intArrayOne, intArrayTwo, currentNumber, buttonValue, newTotalValue;
	Frame f1;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	Panel p1, p2;
	TextField tf1;
	GridLayout g1;

	MasterCalculator() {
		f1 = new Frame("Calculator");
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
		p1 = new Panel();
		p2 = new Panel();
		f1.setLayout(new FlowLayout());
		b1 = new Button("0");
		b1.addActionListener(this);
		b2 = new Button("1");
		b2.addActionListener(this);
		b3 = new Button("2");
		b3.addActionListener(this);
		b4 = new Button("3");
		b4.addActionListener(this);
		b5 = new Button("4");
		b5.addActionListener(this);
		b6 = new Button("5");
		b6.addActionListener(this);
		b7 = new Button("6");
		b7.addActionListener(this);
		b8 = new Button("7");
		b8.addActionListener(this);
		b9 = new Button("8");
		b9.addActionListener(this);
		b10 = new Button("9");
		b10.addActionListener(this);
		b11 = new Button("+");
		b11.addActionListener(this);
		b12 = new Button("-");
		b12.addActionListener(this);
		b13 = new Button("*");
		b13.addActionListener(this);
		b14 = new Button("/");
		b14.addActionListener(this);
		b15 = new Button("=");
		b15.addActionListener(this);
		b16 = new Button("C");
		b16.addActionListener(this);
		tf1 = new TextField(30);
		f1.add(tf1);
		GridLayout g1 = new GridLayout(4, 4, 20, 20);
		p1.setLayout(g1);
		p2.setLayout(g1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		f1.add(p1,BorderLayout.NORTH);
		f1.add(p2, BorderLayout.CENTER);
		f1.setSize(300, 300);
		f1.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			currentNumber = tf1.getText();
			buttonValue = "0";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);       
		}

		if(e.getSource()==b2)
		{
			currentNumber = tf1.getText();
			buttonValue = "1";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b3)
		{
			currentNumber = tf1.getText();
			buttonValue = "2";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b4)
		{
			currentNumber = tf1.getText();
			buttonValue = "3";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b5)
		{
			currentNumber = tf1.getText();
			buttonValue = "4";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b6)
		{
			currentNumber = tf1.getText();
			buttonValue = "5";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b7)
		{
			currentNumber = tf1.getText();
			buttonValue = "6";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b8)
		{
			currentNumber = tf1.getText();
			buttonValue = "7";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b9)
		{
			currentNumber = tf1.getText();
			buttonValue = "8";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b10)
		{
			currentNumber = tf1.getText();
			buttonValue = "9";
			newTotalValue = currentNumber+buttonValue;
			tf1.setText(newTotalValue);
		}
		if(e.getSource()==b11)
		{
			intArrayOne = tf1.getText();
			tf1.setText("");
			c=1;

		}
		if(e.getSource()==b12)
		{
			intArrayOne = tf1.getText();
			tf1.setText("");
			c=2;

		}
		if(e.getSource()==b13)
		{
			intArrayOne = tf1.getText();
			tf1.setText("");
			c=3;

		}
		if(e.getSource()==b14)
		{
			intArrayOne = tf1.getText();
			tf1.setText("");
			c=4;

		}
		if(e.getSource()==b15)
		{
			intArrayTwo = tf1.getText();
			switch(c) {
			case 1:
				result = Integer.parseInt(intArrayOne)+Integer.parseInt(intArrayTwo);
				tf1.setText(String.valueOf(result));
				break;
			case 2:
				result = Integer.parseInt(intArrayOne)-Integer.parseInt(intArrayTwo);
				tf1.setText(String.valueOf(result));
				break;
			case 3:
				result = Integer.parseInt(intArrayOne)*Integer.parseInt(intArrayTwo);
				tf1.setText(String.valueOf(result));
				break;
			case 4:
				if (intArrayOne.equals("0") || intArrayTwo.equals("0")) {
					tf1.setText(String.valueOf("ERROR : You can't devide by zero"));
					break;
				}
				else {
					result = Integer.parseInt(intArrayOne)/Integer.parseInt(intArrayTwo);
					tf1.setText(String.valueOf(result));
					break;
				}
			}
		}
		if(e.getSource()==b16) {
			tf1.setText("");
		}
	}

	public static void main(String[] args) {

		MasterCalculator go = new MasterCalculator();
	}

}
