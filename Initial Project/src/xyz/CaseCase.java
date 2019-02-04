package xyz;

public class CaseCase {
	private int number;

	private String Ones(int A) {
		number = A;
		String word = "and";
		switch (A) {

		case 1: 
			word = "One"; break;
		case 2: 
			word = "Two"; break;
		case 3: 
			word = "Three"; break;
		case 4: 
			word = "Four"; break;
		case 5: 
			word = "Five"; break;
		case 6: 
			word = "Six"; break;
		case 7: 
			word = "Seven"; break;
		case 8: 
			word = "Eight"; break;
		case 9: 
			word = "Nine"; break;
		case 10: 
			word = "Ten"; break;
		case 11: 
			word = "Eleven"; break;
		case 12: 
			word = "Twelve"; break;
		case 13: 
			word = "Thirteen"; break;
		case 14: 
			word = "Fourteen"; break;
		case 15: 
			word = "Fifteen"; break;
		case 16: 
			word = "Sixteen"; break;
		case 17: 
			word = "Seventeen"; break;
		case 18: 
			word = "Eighteen"; break;
		case 19: 
			word = "Nineteen"; break;
	}
		return word;
	}
	
	private String ty(int B) {
		String word = "and";
		switch(B) {
		
		case 20: 
			word = "Twenty"; break;
		case 30: 
			word = "Thity"; break;
		case 40: 
			word = "Fourty"; break;
		case 50: 
			word = "Fifty"; break;
		case 60: 
			word = "Sixity"; break;
		case 70: 
			word = "Seventy"; break;
		case 80: 
			word = "Eighty"; break;
		case 90: 
			word = "Ninety"; break;


		}
		return word;
	}

	public static void main(String[] args) {
		CaseCase numbers = new CaseCase();
		numbers.Ones(5);
		
	}

}
