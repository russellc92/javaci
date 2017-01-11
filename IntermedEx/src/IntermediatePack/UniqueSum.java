package IntermediatePack;
/* Russell Claxton - Intermediate Tasks
 * 
 * Task 2 - Unique Sum
 * 
 * */
public class UniqueSum {

	public static void main(String[] args) {
		// Intermediate: - Task 2 - Unique Sum
		System.out.println(tripleSum(1,2,3)); 	
		System.out.println(tripleSum(3,3,3)); // all same, return 0
		System.out.println(tripleSum(1,1,2)); // two same, return unique
		
	}
	
	public static int tripleSum(int valOne, int valTwo, int valThree)
	{ 
		if(valOne == valTwo && valOne == valThree) return 0; // all the same		
		if(valOne == valTwo)
			return valThree;
		if(valOne == valThree)
			return valTwo;
		if(valTwo == valThree)
			return valOne;
		
		return (valOne + valTwo + valThree);
	}
}
