package com.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator c = null;
	
	ICalculatorService service = new ICalculatorService() {
		
		public int add(int num1, int num2) {
	
			return 0;
		}
	};
	
	@Before
	public void setup() {
		c = new Calculator(service);
	}

	@Test
	public void testadd() {
		assertEquals(5, c.add(3, 2));
	}

	@Test
	public void testsub() {
		assertEquals(1, c.sub(3, 2));
	}

	@Test
	public void testmultiply() {
		assertEquals(6, c.multiply(3, 2));
	}

}
