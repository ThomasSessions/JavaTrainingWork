import java.util.Scanner;
import java.util.regex.Pattern;

public class BinaryCalc {

	public static void main(String[] args) {
	    
	    System.out.println("Enter a binary number:");
	    Scanner scan = new Scanner(System.in);
	    if(!Pattern.matches("[a-zA-Z3-9]+", scan.toString())) {
	    	Integer.parseInt(scan.toString(),2);
	    }
	    else
	    {
	    	System.out.println("not binary");
	    }
	    

	    
	    
	    
	  }
		
}