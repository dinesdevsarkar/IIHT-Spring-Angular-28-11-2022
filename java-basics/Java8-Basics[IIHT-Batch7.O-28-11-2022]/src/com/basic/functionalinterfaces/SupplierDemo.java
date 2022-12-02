package com.basic.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierDemo{

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			
			return ("Printing Integer in supplier functional interface");
		};
		System.out.println(supplier.get());
	}
}









//import java.util.function.Supplier;
//
//public class SupplierDemo implements Supplier<String>{
//
//	public static void main(String[] args) {
//		
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
//
//	}
//
//	@Override
//	public String get() {
//		// TODO Auto-generated method stub
//		return "Hello World";
//	}
//
//}