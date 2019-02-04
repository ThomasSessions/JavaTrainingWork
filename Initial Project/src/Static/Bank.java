package Static;

public class Bank {
	static int Dollar;
	static {
		// initialises the onject once it is created for the first time
		Dollar = 95;
	}
	public void setDollar(int a) {
		Dollar = a;
	}
	public void amount(int x) {
		System.out.println(x*Dollar);
	}
	public static void main(String[] args) {
		Bank HSBC = new Bank();
		HSBC.amount(2);
		HSBC.setDollar(100);
		HSBC.amount(2);
		Bank Lloyds = new Bank();
		Lloyds.amount(2);
		
	}
}

