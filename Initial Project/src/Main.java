
public class Main {
	
	
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 15;
		
		int total = Calculations.add(firstNumber, secondNumber);
		String outputMessage = "The sum of " + 
		firstNumber + " and " + secondNumber 
		+ " is " + total;
		System.out.println(outputMessage);
	
	}
}