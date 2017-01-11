package IntermediatePack;
/* Russell Claxton - Intermediate Tasks
 * 
 * Task 4 - Leap Year
 * 
 * */
public class LeapYear {

	public static void main(String[] args) {
		// leap years
		System.out.println(findLeap(2000)); 
		System.out.println(findLeap(1600)); 
		System.out.println(findLeap(2016));
		System.out.println(findLeap(2004));
				
		// non-leap years
		System.out.println(findLeap(2015));
		System.out.println(findLeap(2001));
		System.out.println(findLeap(2003));
		System.out.println(findLeap(1926));
		System.out.println(findLeap(1700));	
	}
	
	static boolean findLeap(int year)
	{	// Method finds whether year is leap or not
		boolean isLeap = false;
		if((year % 4) == 0)
		{	// Rule: A year is a leap year if it is divisible by 4
			if((year % 400) == 0 || (year % 100) != 0){ // and either divisible by 400 or not divisible by 100.
				isLeap = true;
			}			
		} 
		else
			return false;
		
		return isLeap; 
	}
}