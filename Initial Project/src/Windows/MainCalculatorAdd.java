package Windows;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCalculatorAdd {

	public static void Addition() {
		Frame F = new Frame("Add");
		TextField T1, T2, T3;
		Label L0 = new Label("+");
		Button B1 = new Button("=");
		Label L1 = new Label("First Number");
		Label L2 = new Label("Second Number");
		Label L3 = new Label("Result");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		FlowLayout FL = new FlowLayout();
		F.setLayout(FL);
		F.add(L1);
		F.add(T1);
		F.add(L0);
		F.add(L2);
		F.add(T2);
		F.add(B1);
		F.add(T3);
		F.add(L3);

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int number1 = Integer.parseInt(T1.getText());
				int number2 = Integer.parseInt(T2.getText());

				int result = number1 + number2;
				T3.setText(String.valueOf(result));

			}

		});
		
		F.setSize(400, 400);
		F.setVisible(true);

	}
}