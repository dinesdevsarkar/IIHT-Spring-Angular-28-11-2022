package com.basic.interfaces;



interface TaskOne{
	
	void add();
	static Integer ad(Integer x, Integer y) {
		return x+y;
		
	}
	void sub();
	static Integer sb(Integer x,  Integer y) {
		return x-y;
		
	}
	void divide();
	static Integer di(Integer x,  Integer y) {
		return x/y;
		
	}
	void multiply();
	static Integer mul(Integer x,  Integer y) {
		return x*y;
		
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaskOne t1 = new Total();
		t1.add();
		t1.sub();
		t1.divide();
		t1.multiply();
		System.out.println(TaskOne.ad(10, 20));
		System.out.println(TaskOne.sb(10, 20));
		System.out.println(TaskOne.di(10, 20));
		System.out.println(TaskOne.mul(10, 20));

	}

}

class Total implements TaskOne{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("Add : ");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Sub : ");
		
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		System.out.println("Divide : ");
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		System.out.println("Multiply : ");
		
	}
	
}
