package Windows;
import java.awt.Button;
import java.awt.Frame;

import java.awt.*;

public class Frames {
	

	public static void main(String[] args) {
		Frame F = new Frame("Maths");
		TextField T1, T2, T3;
		Label L1 = new Label("+");
		Button B1 = new Button("=");
		Label L2 = new Label("First Number");
		Label L3 = new Label("Second Number");
		Label L4 = new Label("Result");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		FlowLayout FL = new FlowLayout();
		F.setLayout(FL);
		F.add(L2);
		F.add(T1);
		F.add(L1);
		F.add(T2);
		F.add(L3);
		F.add(B1);
		F.add(T3);
		F.add(L4);
		EventHandler button = new EventHandler(T1, T2, T3);
		B1.addActionListener(button);
		F.setSize(400,400);
		F.setVisible(true);

	}
}
