package com.basic.ref;

import java.time.LocalDate;

public class Project {

	public static void projectProgress() {
		// TODO Auto-generated method stub

		System.out.println("Project is making Progress");
		System.out.println("Project Status was approved by the client");
		LocalDate now = LocalDate.now();
		System.out.println("on : "+ now.toString());
	}
	
	public static void thredTask() {
		for (int i = 0; i <=10; i++) {
			System.out.println(i*2);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//task to create method ref for odd numbers
	public static void oddNumberTo100() {
		for (int i = 0; i <=100; i++) {
			
			if (i % 2 != 0) {
			System.out.println(i + " ");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
