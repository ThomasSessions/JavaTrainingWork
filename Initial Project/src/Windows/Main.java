package Windows;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		Frame F = new Frame("Maths");
		TextField T1, T2, T3;
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("*");
		Button B4 = new Button("/");
		Label L1 = new Label("First Number and Second Number");
		Label L2 = new Label("Result");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		FlowLayout FL = new FlowLayout();
		F.setLayout(FL);
		F.add(L1);
		F.add(T1);
		F.add(T2);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(T3);
		F.add(L2);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int number1 = Integer.parseInt(T1.getText());
				int number2 = Integer.parseInt(T2.getText());

				int result = number1 + number2;
				T3.setText(String.valueOf(result));

			}

		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int number1 = Integer.parseInt(T1.getText());
				int number2 = Integer.parseInt(T2.getText());

				int result = number1 - number2;
				T3.setText(String.valueOf(result));

			}

		});
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int number1 = Integer.parseInt(T1.getText());
				int number2 = Integer.parseInt(T2.getText());

				int result = number1 * number2;
				T3.setText(String.valueOf(result));

			}

		});
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int number1 = Integer.parseInt(T1.getText());
				int number2 = Integer.parseInt(T2.getText());

				int result = number1 / number2;
				T3.setText(String.valueOf(result));

			}

		});
		F.setSize(400, 400);
		F.setVisible(true);

	}
}
