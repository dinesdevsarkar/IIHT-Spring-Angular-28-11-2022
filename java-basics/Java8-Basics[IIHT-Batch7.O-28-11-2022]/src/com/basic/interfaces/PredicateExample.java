package com.basic.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> predicate1= num1 -> (num1 > 20);
		
		System.out.println(predicate1.test(17));
		System.out.println(predicate1.test(23));

	}

}
