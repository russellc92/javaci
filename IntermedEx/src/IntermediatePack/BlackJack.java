package IntermediatePack;
/* Russell Claxton - Intermediate Tasks - Black Jack
 * 
 * Task 1 - Black Jack
 * 
 * */
public class BlackJack {

	public static void main(String[] args) {

		// Intermediate: - Task 1 - BlackJack
		System.out.println(blackJack(17,18)); // return winner
		System.out.println(blackJack(22,18)); // one is over 21, return other if < 22
		System.out.println(blackJack(17,17)); // :S
		System.out.println(blackJack(22,22)); // both over 21, should return 0


	}
	
	public static int blackJack(int handOne, int handTwo)
	{	// Method to find outcome of hands
		int desired = 21;
		if(handOne > desired && handTwo > desired)
			return 0;
		else if(handOne > desired) // if the card is over 21, just set to zero for auto lose
			handOne = 0;
		else if(handTwo > desired)
			handTwo = 0;		

		int distOne = desired - handOne;
		int distTwo = desired - handTwo;

		return distOne > distTwo ? handTwo : handOne;
	}
}
