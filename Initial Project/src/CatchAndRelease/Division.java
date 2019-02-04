package CatchAndRelease;

public class Division {

	public static void main(String XYZ[]) {
		int A, B, C;
		A=B=C=0;
			try {
				A=Integer.parseInt(XYZ[0]);
				B=Integer.parseInt(XYZ[1]);
				C=A/B;
				System.out.println("Result: " + C);
			}
		catch(IndexOutOfBoundsException E) {
			System.out.println("Please send two numbers");
		}
		catch(NumberFormatException E) {
			System.out.println("Send only numbers");
		}
		catch(ArithmeticException E) {
			System.out.println("Can't divide by zero");
		}
		finally {
			System.out.println("Hello");
		}
		
	}
}
