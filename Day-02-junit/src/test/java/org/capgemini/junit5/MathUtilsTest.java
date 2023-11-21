package org.capgemini.junit5;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class MathUtilsTest {
	MathUtils mathUtils;
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}

	@BeforeEach
	void init() {
		 mathUtils = new MathUtils();
	}
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up....");
	}

	    @Test
        void testAdd() {
		
		int expected=5;
		
		int actual= mathUtils.add(2, 3);
		assertEquals(expected,actual,"The add method should add two values");
		
	  }
	    @Test
		void testDivide() {
	    	
			assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
					"Divide should throw ArithmeticException when denominator is zero");
		}
		
		@Test 
		void testComputeCircleArea() {
			
			assertEquals(314.1592653589793, 
					mathUtils.computeCircleArea(10), 
					"Should return right circle area");
		}
}
		
	
	

