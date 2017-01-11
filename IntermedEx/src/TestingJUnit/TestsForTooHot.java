package TestingJUnit;
import static org.junit.Assert.*;

import org.junit.Test;

import IntermediatePack.TooHot;
import IntermediatePack.UniqueSum;


public class TestsForTooHot {

	@Test
	public void test() {
		// Funcs below should alll return true
		assertTrue("ERROR ERROR ERROR - !TRUE", TooHot.findTempRange(60,true));
		assertTrue("ERROR ERROR ERROR - !TRUE", TooHot.findTempRange(100,true));
		assertTrue("ERROR ERROR ERROR - !TRUE", TooHot.findTempRange(90,false));
		assertTrue("ERROR ERROR ERROR - !TRUE", TooHot.findTempRange(60, false));

		// Should return false
		assertFalse("ERROR ERROR ERROR- !FALSE", TooHot.findTempRange(101,true));
		assertFalse("ERROR ERROR ERROR - !FALSE", TooHot.findTempRange(59,true));
		assertFalse("ERROR ERROR ERROR - !FALSE", TooHot.findTempRange(999999999,true));
		assertFalse("ERROR ERROR ERROR - !FALSE", TooHot.findTempRange(91,false));
		
	}

}
