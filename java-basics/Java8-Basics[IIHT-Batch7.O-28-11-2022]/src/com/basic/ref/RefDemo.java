package com.basic.ref;

public class RefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ref Method Demo");

		//Providing implementation of functional interface
		//Class Name :: Method Name

		IWork iwork = Project :: projectProgress;

		iwork.doProject();
		
		Runnable runnable1 = Project :: thredTask;
		Thread t1 = new Thread(runnable1);
		t1.start();
		
		
		//Task to create method  ref for odd numbers
		Runnable runnable2 = Project :: oddNumberTo100;
		Thread t2 = new Thread(runnable2);
		t2.start();

	}

}





//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	
//	System.out.println("Ref Method Demo");
//	
//	//Providing implementation of functional interface
//	
//	IWork iwork = () -> {
//		System.out.println("Printing Iwork interface do project method");
//	};
//	
//iwork.doProject();
//}
