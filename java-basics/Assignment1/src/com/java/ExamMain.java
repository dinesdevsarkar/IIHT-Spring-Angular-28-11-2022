package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamMain {

	public static void main(String[] args) {
		
		List<CompetativeExam> competativeExamList = new ArrayList<>();
		
		competativeExamList.add(new CompetativeExam(1,"IIT","Dinesh",3,10000));
		competativeExamList.add(new CompetativeExam(2,"JEE","Ganesh",13,12000));
		competativeExamList.add(new CompetativeExam(3,"CAT","Ramesh",12,9000));
		competativeExamList.add(new CompetativeExam(4,"MHCET","Mahesh",1,11000));
		competativeExamList.add(new CompetativeExam(5,"UPSC","Somesh",4,15000));
		competativeExamList.add(new CompetativeExam(6,"SSC","Amol",2,4000));
		competativeExamList.add(new CompetativeExam(7,"AIEEE","Vivek",15,14000));
		competativeExamList.add(new CompetativeExam(8,"NEET","Om",5,13000));
		competativeExamList.add(new CompetativeExam(9,"XAT","Pandurang",6,2000));
		competativeExamList.add(new CompetativeExam(10,"CDS","Ashish",11,5000));
		competativeExamList.add(new CompetativeExam(11,"FCI","Astik",7,3000));
		competativeExamList.add(new CompetativeExam(12,"GATE","Rahul",8,1000));
		competativeExamList.add(new CompetativeExam(13,"IES","Aditya",10,6000));
		competativeExamList.add(new CompetativeExam(14,"FCI","Sharad",9,7000));
		competativeExamList.add(new CompetativeExam(15,"MPSC","Pravin",14,8000));
		
		for (CompetativeExam competativeExam: competativeExamList) {
			System.out.println("Before Sorting : "+competativeExamList);
		}
		
		Collections.sort(competativeExamList,
				(o1, o2) -> o1.getTotalFees() - o2.getTotalFees());
		System.out.println("\n");
		System.out.println("After sorting total fees in ascending order");
		competativeExamList.forEach((s) -> System.out.println(s));
		
		Collections.sort(competativeExamList,
				(o1, o2) -> o2.getTotalFees() - o1.getTotalFees());
		System.out.println("\n");
		System.out.println("After sorting total fees in descending order");
		competativeExamList.forEach((s) -> System.out.println(s));
		
		Collections.sort(competativeExamList,
				(o1, o2) -> o1.getCourseDuration() - o2.getCourseDuration());
		System.out.println("\n");
		System.out.println("After sorting course duration shortest to longest");
		competativeExamList.forEach((s) -> System.out.println(s));
		
		Collections.sort(competativeExamList,
				(o1, o2) -> o2.getCourseDuration() - o1.getCourseDuration());
		System.out.println("\n");
		System.out.println("After sorting course duration longest to shortest");
		competativeExamList.forEach((s) -> System.out.println(s));
		
		
	}

}
