package Windows;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculatorCaller {

	public static void main(String[] args) {
		NewCalculator run = new NewCalculator();
		Frame F = new Frame("Maths");
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("*");
		Button B4 = new Button("/");
		GridLayout G = new GridLayout(4, 1);

		B1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				run.setOperation("Addition");

			}
		});
		B2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				run.setOperation("Subtraction");

			}
		});
		B3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				run.setOperation("Multiplication");

			}
		});
		B4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				run.setOperation("Division");

			}
		});


		F.setLayout(G);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.setSize(400, 400);
		F.setVisible(true);
	}

}
