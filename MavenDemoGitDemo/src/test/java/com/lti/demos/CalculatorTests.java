package com.lti.demos;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class CalculatorTests {

	/*Calculator c= new Calculator();

	@Test
	public void testCalsayhello()
	{
		String msg =c.hello();
		Assertions.assertEquals("Hello LTI",msg);
	}
	
	@Test
	public void testaddtwonumber() {
		 
		int f =c.addNos(5,300);
		Assertions.assertEquals(305,f);
	}
	
	@Test
	public void testsubNos() {
		
		int f =c.subNos(5,300);
		Assertions.assertEquals(-295,f,"pls chk the subnosmethod code");
	}
	*/
	@Test
	public void testAssertNulls() {
		String s1 =null;
		String s2 ="neh";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}

	@Test
	public void testAssertfalse() {
		
		Assertions.assertFalse("sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller so flase");
		Assertions.assertNotEquals("hello","hell");
	}
	@Test
	public void testArray() {
		ArrayList <Integer> mylist= new ArrayList<>();
		Assertions.assertEquals(0,mylist.size());
		Assertions.assertTrue(mylist.isEmpty());
	}
}