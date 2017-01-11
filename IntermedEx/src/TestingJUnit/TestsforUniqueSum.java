package TestingJUnit;
import static org.junit.Assert.*;
import org.junit.Test;
import IntermediatePack.UniqueSum;

public class TestsforUniqueSum {

	@Test
	public void test() {
		assertEquals("ERROR ERROR ERROR",UniqueSum.tripleSum(1,2,3),6);
		assertEquals("ERROR ERROR ERROR",UniqueSum.tripleSum(0,0,0),0);
		assertEquals("ERROR ERROR ERROR",UniqueSum.tripleSum(1,1,2),2);
		assertEquals("ERROR ERROR ERROR",UniqueSum.tripleSum(1,2,2),1);
		
		assertEquals("ERROR ERROR ERROR",UniqueSum.tripleSum(666,777,888),2331);	
	}
}
