package com.basic.lambda;


public class LearnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnLambda learnLambda= new LearnLambda();
		
		MathOperation add = (Integer num1, Integer num2) -> (num1 + num2);
		MathOperation sub = (Integer num1, Integer num2) -> (num1 - num2);
		MathOperation divide = (Integer num1, Integer num2) -> (num1 / num2);
		MathOperation multiply = (Integer num1, Integer num2) -> (num1 * num2);
		
		System.out.println("Additio is : "+ add.operation(100, 50));
		System.out.println("Additio is : "+ sub.operation(100, 50));
		System.out.println("Additio is : "+ divide.operation(100, 50));
		System.out.println("Additio is : "+ multiply.operation(100, 50));
		
		

	}

}
