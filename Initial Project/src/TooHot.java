
public class TooHot {
	public void isItTooHot(boolean isSummer, int temperature, boolean iAmTooHot) {
		
		if (temperature > 100 && isSummer) {
			iAmTooHot = true;
			System.out.println(iAmTooHot);
		} 
		else if (temperature >= 90 && isSummer) {
			System.out.println(iAmTooHot);
		}
		else if (temperature >= 90 && !isSummer) {
			iAmTooHot = true;
			System.out.println(iAmTooHot);
		}  
		else if (temperature >= 90 && !isSummer) {
			iAmTooHot = true;
			System.out.println(iAmTooHot);
		}
		else if (temperature >= 90 && !isSummer) {
				iAmTooHot = true;
				System.out.println(iAmTooHot);
		}
		else if (temperature >= 60) {
			iAmTooHot = true;
			System.out.println(iAmTooHot);
		}	
		
	}
}
