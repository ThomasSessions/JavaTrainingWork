package JavaOOPExample;

public class Bank {
	
	static int Dollar;
	
	public void Amount(int A) {
		System.out.println("Amount: " + A*Dollar);
	}
	public void SetDollar(int A) {
		Dollar = A;
	}
	public static void main(String[] args) {
		Bank HSBC, Barclays;
		HSBC = new Bank();
		Barclays = new Bank();
		HSBC.SetDollar(50);
		Barclays.Amount(2);
		HSBC.Amount(2);
		HSBC.SetDollar(20);
		HSBC.Amount(3);
		
	}
}
