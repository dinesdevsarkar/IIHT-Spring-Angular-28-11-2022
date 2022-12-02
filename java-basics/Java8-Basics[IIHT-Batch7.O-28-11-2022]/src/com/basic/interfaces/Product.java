package com.basic.interfaces;


interface Manufacturing{
	
	void made();
}

interface Sales{
	
	void sold();
}


public class Product implements Manufacturing,Sales{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		p.made();
		p.sold();

	}

	@Override
	public void sold() {
		// TODO Auto-generated method stub
		System.out.println("Printing Sales method");
		
	}

	@Override
	public void made() {
		// TODO Auto-generated method stub
		System.out.println("Printing Manufacturing method");
		
	}

}
