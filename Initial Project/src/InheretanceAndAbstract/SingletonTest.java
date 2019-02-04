package InheretanceAndAbstract;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton A, B, C;
		A = Singleton.CreateObject();
		B = Singleton.CreateObject();
		C = Singleton.CreateObject();
		
		A.setA(4);
		System.out.println(A.getA() + " " + B.getA() + " " + C.getA());
		

	}

}
