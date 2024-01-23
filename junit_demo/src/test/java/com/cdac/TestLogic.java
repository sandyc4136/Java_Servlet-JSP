package com.cdac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogic {

	MaxInArray max= new MaxInArray();
	@Test
	void testFindMax() {
		assertEquals(4,max.findMax(new int[]{1,3,4,2}));
		assertEquals(-1,max.findMax(new int[]{-1,-13,-4,-12}));
	}
	


}
