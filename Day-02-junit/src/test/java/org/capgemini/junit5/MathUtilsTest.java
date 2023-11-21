package org.capgemini.junit5;




import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

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

	    @Test
	    @DisplayName("Adding two numbers")
        void testAdd() {
		
		int expected=5;
		
		int actual= mathUtils.add(2, 3);
		assertEquals(expected,actual,"The add method should add two values");
		
	  }
	    @Test
	    @EnabledOnOs(OS.LINUX)
		void testDivide() {
	    	
			assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
					"Divide should throw ArithmeticException when denominator is zero");
		}
		
		@Test 
		@DisplayName("Area of circle")
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
}
		
	
	

