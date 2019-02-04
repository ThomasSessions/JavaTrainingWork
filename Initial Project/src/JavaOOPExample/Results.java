package JavaOOPExample;

public class Results {

	private int physics, chemistry, math; 
	private int subjectFailed = 0;
	private boolean invalidEntry;
	private boolean MathFail;
	private boolean ChemFail;
	private boolean PhyFail;


	public void Physics(int A) {
		if (A >= 0 && A <= 150) {
			physics = A;
		} else {
			invalidEntry = true;
			System.out.println("Invalid Physics mark");
		}
		if (A < 60) {
			PhyFail = true;
			subjectFailed++;		
		}
	}

	public void Chemistry(int B) {
		if (B >= 0 && B <= 150) {
			chemistry = B;
		} else {
			invalidEntry = true;
			System.out.println("Invalid Chemistry mark");
		}
		if (B < 60) {
			ChemFail = true;
			subjectFailed++;}
	}
	
	public void Maths(int C) {
		if (C >= 0 && C <= 150) {
			math = C;
		} else {
			invalidEntry = true;
			System.out.println("Invalid Maths mark");
		}
		if (C < 60) {
			MathFail = true;
			subjectFailed++;		
		}
	}
	
	public void Failing() {
		if (subjectFailed == 0) {
			ShowResults();
		}
		else if ((subjectFailed == 1) && (PhyFail == true)) {
			System.out.println("Retake the Physics exam");
		}
		else if ((subjectFailed == 1) && (MathFail == true)) {
			System.out.println("Retake the Maths exam");
		}
		else if ((subjectFailed == 1) && (ChemFail == true)) {
			System.out.println("Retake the Chemistry exam");
		}
		else if (subjectFailed == 2) {
			System.out.println("Repeat the course");
		}
		else if (subjectFailed == 3) {
			System.out.println("Go home");	
		}
		
	}
	public void ShowResults() {

		int total, per;
		total = physics + chemistry + math;
		per = total * 100 / 300;
		System.out.println("Number of subjects failed: " + subjectFailed);
		System.out.println("Total mark: " + total + "/450");
		System.out.println("Average percentage: " + per + "/150");
		}

	public static void main(String[] args) {
		Results Peter;
		Peter = new Results();
		Peter.Physics(70);
		Peter.Chemistry(80);
		Peter.Maths(40);
		Peter.Failing();
		System.out.println();
	}
}