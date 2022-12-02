package com.basic.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		Consumer<Integer> consumer = (t) -> System.out.println("Printing Integer : "+ t);
//		
//		consumer.accept(4000);
		
		
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		
		//numberList.forEach( number -> System.out.println("Printing : "+ number));
		
		numberList.stream().forEach( number -> System.out.println("Printing : "+ number));

	}

}
