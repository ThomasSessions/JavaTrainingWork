package Windows;


import java.awt.*;
import java.awt.event.*;

public class NewCalculator extends Frame {

	TextField T1, T2, T3;
	Label L0, L1, L2, L3;
	Button B1;

	public NewCalculator() {
		B1 = new Button();
		L1 = new Label("First Number: ");
		L2 = new Label("Second Number: ");
		L3 = new Label("Result");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		GridLayout GL = new GridLayout(4, 2);
		setLayout(GL);
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B1);
		add(T3);
		add(L3);
		setSize(400, 400);


		B1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e) {
				String title = getTitle();
				int A, B, C = 0;
				A = Integer.parseInt(T1.getText());
				B = Integer.parseInt(T2.getText());
				switch (title) {

				case "Addition":
					C = A + B;
					break;

				case "Subtraction":
					C = A - B;
					break;

				case "Multiplication":
					C = A * B;
					break;

				case "Division":
					C = A / B;
					break;


				}
				
				T3.setText(String.valueOf(C));
				
			}

		});

	}

	public void setOperation(String title) {
		setTitle(title);
		if (title.equals("Addition")) {
			B1.setLabel("+");
		}
		if (title.equals("Subtraction")) {
			B1.setLabel("-");
		}
		if (title.equals("Multiplication")) {
			B1.setLabel("*");
		}
		if (title.equals("Division")) {
			B1.setLabel("/");

		}
		setVisible(true);
	}
}

