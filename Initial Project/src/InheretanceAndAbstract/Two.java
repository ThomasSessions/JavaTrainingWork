package InheretanceAndAbstract;

public class Two extends One {
	
	public void Go() {
		System.out.println("Go");
	}
public static void main(String[] args) {
	One ref = new Two();
	ref.msg();
	// ref.Go(); This wont work because its referencing a method that is already in it, not inherited from its child
}
}
