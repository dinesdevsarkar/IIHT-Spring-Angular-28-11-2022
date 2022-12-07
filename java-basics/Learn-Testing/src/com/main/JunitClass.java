package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {
	
	String username = "Dinesh123";
	
	@Test
	public void testUsername() {
		System.out.println("Testing username test case");
		assertEquals("Dinesh123", username);
	}
	
	@Test
	public void junitMethod(){
		System.out.println("Unit Testing Class");
	}

	public static void main(String[] args) {
		
		JunitClass junit = new JunitClass();
		junit.junitMethod();
		junit.testUsername();
		System.out.println("Executing main method here");

	}

}
