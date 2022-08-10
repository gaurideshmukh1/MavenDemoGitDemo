package com.lti.demos;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {
	@Test
	public void testmethodExp()
	{
		Calculator c = new Calculator();
		final Exception e = assertThrows(ArithmeticException.class,()->{c.searchEmp(0);});
		Assertions.assertEquals("u enter zero",e.getMessage());
	}

}