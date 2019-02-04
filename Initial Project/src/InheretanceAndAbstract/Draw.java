package InheretanceAndAbstract;

public class Draw {
	
	public static void drawSomething(Drawing reference) {
		reference.doDrawing();
	}
public static void main(String[] args) {
	Circle x = new Circle();
	Line t = new Line();
	
	drawSomething(x);
	drawSomething(t);
}
}
