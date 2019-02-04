package CatchAndRelease;

public class CatchException extends Exception {

	public static void main(String[] args) {
		int c = 0;
		try {
			for (long i = 0L; i < Long.MAX_VALUE; i++) {
			c++;}
			System.out.println(c);
			
		} catch (Exception E) {
			E.printStackTrace();
	}

}}
