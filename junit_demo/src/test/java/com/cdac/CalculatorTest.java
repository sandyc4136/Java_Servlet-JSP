package com.cdac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_if_add_works() {
		Calculator c= new Calculator();
		int actualValue = c.add(10, 20);
		
		// check if add method working or not ?
		// we should never use println in test cases
		int expectedValue=30;
	
		
		assertEquals(expectedValue	, actualValue);
	}
	
	@Test
	void test_if_sub_works() {
		Calculator c= new Calculator();
		int actualValue = c.sub(10, 20);
		
		// check if add method working or not ?
		// we should never use println in test cases
		
		int expectedValue=-10;
		assertEquals(expectedValue , actualValue);
	}

}
