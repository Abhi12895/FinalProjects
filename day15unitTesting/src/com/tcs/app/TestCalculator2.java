
package com.tcs.app;
 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
 
public class TestCalculator2 {

    static	Calculator calculator ;
 
	@BeforeAll

	static void setUpBeforeClass() throws Exception {

		calculator =new Calculator();

		System.out.println("Befre All");

	}
 
	@AfterAll

	static void tearDownAfterClass() throws Exception {

	 calculator =null;

		System.out.println("After All");

	}
 
	@BeforeEach

	void setUp() throws Exception {

		System.out.println("Before each");

	}
 
	@AfterEach

	void tearDown() throws Exception {

		System.out.println("After Each");

	}
 
	@Test

	void test() {

		fail("Not yet implemented");

	}
 
}
