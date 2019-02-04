package InheretanceAndAbstract;

public class Math2 extends Math implements InterfaceBank {

	@Override
	public void Add(int No1, int No2) {
		int result = No1 + No2;
		System.out.println(result);
	}

	@Override
	public void Sub(int a, int b) {
		System.out.println(a - b);

	}

	@Override
	public void Deposite(int amount) {

	}

	@Override
	public void Withdraw(int amount) {

	}

	@Override
	public void Balance() {
	}

	public static void main(String[] args) {
		// We add some objects and put in some values so the functions can run
		Math2 m = new Math2();
		m.Add(6, 4);
		m.Sub(10, 5);
	}

}
