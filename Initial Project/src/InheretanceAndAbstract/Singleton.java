package InheretanceAndAbstract;

public class Singleton {
	static Singleton x;
	private int a;
	
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	private Singleton() {
	}

	public static Singleton CreateObject() {
		if (x == null) {
			x = new Singleton();
		}
		return x;
	}

}
