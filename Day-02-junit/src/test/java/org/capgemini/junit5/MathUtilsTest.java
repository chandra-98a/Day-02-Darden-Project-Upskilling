package org.capgemini.junit5;




import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.Assume.assumeThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathUtils;
	@BeforeAll
 void beforeAllInit() {
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

	/*
	 * @Test
	 * 
	 * @DisplayName("Adding two numbers") void testAdd() {
	 * 
	 * int expected=5;
	 * 
	 * int actual= mathUtils.add(2, 3);
	 * assertEquals(expected,actual,"The add method should add two values");
	 * 
	 * }
	 */
	@Nested
	@DisplayName("Adding two numbers")
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(2, mathUtils.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathUtils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathUtils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	    @Test
	    //@EnabledOnOs(OS.LINUX)
	    
		void testDivide() {
	    	assumeTrue(true);
			assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
					"Divide should throw ArithmeticException when denominator is zero");
		}
		
		@Test 
		@DisplayName("Area of circle")
		@RepeatedTest(3)
		void testComputeCircleArea() {
			
			assertEquals(314.1592653589793, 
					mathUtils.computeCircleArea(10), 
					"Should return right circle area");
		}
		
		@Test
		@DisplayName("Testing @disabled ")
		@Disabled
		void testDisabled() {
			fail("This test should be disabled");
		}
		@Test
		@DisplayName("Multiply method")
		void testMultiply() {
			assertAll(
					()-> assertEquals(4,mathUtils.multiply(2, 2),"should return the right product"),
					()->assertEquals(0,mathUtils.multiply(0, 2),"should return the right product"),
					()->assertEquals(-2,mathUtils.multiply(-1, 2),"should return the right product")
					);
		}
}
		
	
	

