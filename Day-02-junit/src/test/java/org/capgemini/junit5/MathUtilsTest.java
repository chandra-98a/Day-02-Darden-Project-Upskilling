package org.capgemini.junit5;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

	    @Test
        void testAdd() {
		MathUtils mathUtils= new MathUtils();
		int expected=5;
		
		int actual=mathUtils.add(2, 3);
		assertEquals(expected,actual,"The add method should add two values");
		
	  }
		
		@Test 
		void testComputeCircleArea() {
			MathUtils mathUtils= new MathUtils();
			assertEquals(314.1592653589793, 
					mathUtils.computeCircleArea(10), 
					"Should return right circle area");
		}
}
		
	
	

