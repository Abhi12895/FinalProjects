package com.tcs.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestCalculator {
//TDD test driven development where testing is done before development example hackrank test
	
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	//assertions approach for testing

	 
		@Test
		public void testAdd() {
			Calculator calculator =new Calculator();
			int actual=calculator.add(10,10);
			int expected=20;
			assertEquals(expected,actual);
		}
		@Test
		public void testAdd2() {
			Calculator calculator =new Calculator();
			int result = calculator.add(10,10);
			boolean expected = true;
			boolean actual = result>0 && result<=20;
			assertTrue(expected==actual);
		}
	}


