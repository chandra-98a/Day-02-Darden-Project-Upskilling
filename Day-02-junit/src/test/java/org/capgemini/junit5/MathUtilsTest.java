package org.capgemini.junit5;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

	@Test
 void test() {
		MathUtils mathUtils= new MathUtils();
		int expected=5;
		
		int actual=mathUtils.add(2, 3);
		assertEquals(expected,actual);
		
	}

}
