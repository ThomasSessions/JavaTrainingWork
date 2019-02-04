package Static;

public class This {
	int x;

	public void One() {
		int x;
		x = 15;
		// This is a reference to the current address
		this.x = 25;

		System.out.println(++x);
	}

	public void Show() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		This ref = new This();
		ref.One();
		ref.Show();
		
	}
}
