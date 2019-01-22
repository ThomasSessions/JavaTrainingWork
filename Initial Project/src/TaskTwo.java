public class TaskTwo {

	public void completeTask(int firstNumber, int secondNumber, boolean multiply, int[] numberArray, int loop) {

		for (loop = 0; loop < 10; loop++) {

			if (numberArray[loop] == 0) {
				System.out.println("Non 0 number is " + secondNumber);

			} else if (secondNumber == 0) {
				System.out.println("Non 0 number is " + numberArray[loop]);

			} else if (multiply) {

				int total = Calculations.add(numberArray[loop], secondNumber);
				String outputMessage = "The sum of " + numberArray[loop] + " and " + secondNumber + " is " + total;
				System.out.println(outputMessage);

			} else {

				int total = Calculations.multi(numberArray[loop], secondNumber);
				String outputMessage1 = "The sum of " + numberArray[loop] + " and " + secondNumber + " is " + total;
				System.out.println(outputMessage1);
			}
		}
	}
}
