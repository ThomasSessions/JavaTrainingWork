package Windows;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
	
	TextField T1, T2, T3;
	
	public EventHandler(TextField T1, TextField T2, TextField T3) {
		this.T1 = T1;
		this.T2 = T2;
		this.T3 = T3;
	}

	@Override
	public void actionPerformed(ActionEvent x) {
		String text1 = T1.getText();
		String text2 = T2.getText();
		int number1 = 0;
		int number2 = 0;
		try {
			number1 = Integer.parseInt(text1);
			number2 = Integer.parseInt(text2);
		}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}	
		int result = number1 + number2;
		T3.setText(String.valueOf(result));
	}

}
