package JavaOOPExample;

public class ABC {
	static int x;
	public static void hello(){
		System.out.println("Hello world");
	}
	public static void go() {
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		//ABC refence = new ABC();
		ABC.go();
		ABC.hello();
	}
}
