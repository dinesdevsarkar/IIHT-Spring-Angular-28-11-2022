package com.basic.interfaces;


public class Vehicle {
	
	public static void main(String[] args) {
		
		Drivable d1= new Car();
		Drivable d2= new Truck();
		Drivable d3= new Bike();
		
		d1.drive();
		d2.drive();
		d3.drive();
		
	}

	

}


class Car implements Drivable {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("Car is driven");
		
	}

}

class Truck implements Drivable {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("Truck is driven");
		
	}

}


class Bike implements Drivable {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike is driven");
		
	}

}
