package com.mockito;

public class Calculator {
	
	ICalculatorService service;
	
	public Calculator(ICalculatorService service) {
		this.service = service;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

}
