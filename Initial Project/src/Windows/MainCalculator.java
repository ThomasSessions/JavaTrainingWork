package Windows;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCalculator {

	public static void main(String[] args) {
		Frame F = new Frame("Maths");
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("*");
		Button B4 = new Button("/");
		GridLayout G = new GridLayout(4, 1);
		F.setLayout(G);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				MainCalculatorAdd.Addition();

			}

		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				MainCalculatorSub.Sub();

			}

		});
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				MainCalculatorMulti.Multiply();

			}

		});
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				MainCalculatorDivide.Div();

			}

		});

		F.setSize(400, 400);
		F.setVisible(true);

	}
}
