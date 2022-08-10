package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParametersTest {

	@Test
	public void testLambdaList() {
		Integer[] intAry= {10,20,5,25};
		List<Integer> intList= Arrays.asList(intAry);
		
		Assertions.assertAll(
				()->assertEquals(10,intList.get(0)),
				()->assertEquals(20,intList.get(1)),
				()->assertEquals(5,intList.get(2)),
				()->assertEquals(25,intList.get(3))
				
				);
		
	}

}
