



public class IntermedEx {

	public static void main(String[] args) {

				
		System.out.println(blackJack(17,18));
		
		System.out.println(blackJack(22,18));
		
		System.out.println(blackJack(17,17));
		
		System.out.println(blackJack(22,22));
		
		
	}
	
	// Intermediate Exercises - Task 1 - BlackJack
	static int blackJack(int handOne, int handTwo)
	{
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
