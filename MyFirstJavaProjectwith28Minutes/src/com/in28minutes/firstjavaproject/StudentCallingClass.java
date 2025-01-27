package com.in28minutes.firstjavaproject;

public class StudentCallingClass {

	public static void main(String[] args) {

		//Student student = new Student("Parveen", new int[] {10,20,30});
		//Student student = new Student("Parveen",10,20,30); //variable argument
		Student student = new Student("Parveen", 10,20,30);
		System.out.println("Student total Marks" + student.getTtoalSumOfMarks());
		System.out.println("Student all marks " + student);
		System.out.println("Student Average marks" + student.getAverageMarks());
		

}

	}


