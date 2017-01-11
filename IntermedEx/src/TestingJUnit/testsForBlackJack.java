package TestingJUnit;

//import static org.junit.Assert.assertEquals;
import IntermediatePack.BlackJack;
import static org.junit.Assert.*;

import org.junit.Test;
//import IntermediatePack.BlackJack;

public class testsForBlackJack {

	@Test 
	public void BlackJackTests()
	{
		assertEquals("ERROR ERROR ERROR",BlackJack.blackJack(17,18),18);
		assertEquals("ERROR ERROR ERROR",BlackJack.blackJack(22,18),18); // test for over 21
		assertEquals("ERROR ERROR ERROR",BlackJack.blackJack(18,18),18); // test equals
		assertEquals("ERROR ERROR ERROR",BlackJack.blackJack(0,18),18); // test for 0
		assertEquals("ERROR ERROR ERROR",BlackJack.blackJack(17,999),17); //test large number
	}
}
