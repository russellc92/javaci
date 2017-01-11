package IntermediatePack;
/* Russell Claxton - Intermediate Tasks
 * 
 * Task 3 - Too Hot?
 * 
 * */
public class TooHot {

	public static void main(String[] args) {
		// Intermediate: - Task 3 - Too Hot?
		
		boolean tempRange = findTempRange(78, false); // not summer and in range
		System.out.println(tempRange == true ? "Within Range": "Without Range");
		
		tempRange = findTempRange(95, true); // Summer and in range
		System.out.println(tempRange == true ? "Within Range": "Without Range");		
		
		tempRange = findTempRange(55, true); // Summer and out of lower range
		System.out.println(tempRange == true ? "Within Range": "Without Range");

	}

	public static boolean findTempRange(int temperature, boolean isSummer)
	{
		if(isSummer){
			if(temperature<=100 && temperature >=60){
				return true;
			} else return false;
		}
		else{
			if(temperature<=90 && temperature>=60)
			{
				return true;
			} else 
				return false;
		}
		//return false;
	}	
}
