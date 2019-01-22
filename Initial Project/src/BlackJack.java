public class BlackJack {

	public void overTwentyOne(int blackJackOne, int blackJackTwo) {

		if (blackJackOne == 21 || blackJackTwo == 21) {
			System.out.println(21);
		}
		else if (blackJackOne <= 21 && blackJackOne > blackJackTwo) {
			System.out.println(blackJackOne);
		}
		else if (blackJackTwo <= 21 && blackJackTwo > blackJackOne) {
			System.out.println(blackJackTwo);
		}
		else if (blackJackOne == blackJackTwo && blackJackOne <= 21 && blackJackTwo <= 21) {
			System.out.println(blackJackOne);
		}
		else if (blackJackOne > 21 && blackJackTwo > 21) {
			System.out.println(0);
		}
		else if (blackJackOne > 21 && blackJackTwo <= 21) {	
			System.out.println(blackJackTwo);
		}
		else if (blackJackTwo > 21 && blackJackOne <= 21) {	
			System.out.println(blackJackOne);
		}
		
	}
}
