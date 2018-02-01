package main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LargestCombinedNumberTest {

	@Test
	public void test() {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<String> expResults = new ArrayList<String>();
		
		l.add(Arrays.asList(56,5,50));
		expResults.add("56550");
		
		l.add(Arrays.asList(50,2,1,9));
		expResults.add("95021");
		
		l.add(Arrays.asList(420,42,423));
		expResults.add("42423420");
		
		l.add(Arrays.asList(56,6,6,50));
		expResults.add("665650");
		
		String result;
		for(int i = 0; i < 4; i++){
			result = LargestCombinedNumber.largestCombinedNumber(l.get(i));
			assertEquals("Expected: "+ expResults.get(i) + "\n Result: " + result, expResults.get(i), result);
		}
	}

}
