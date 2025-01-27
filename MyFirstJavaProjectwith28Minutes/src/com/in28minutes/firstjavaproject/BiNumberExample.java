package com.in28minutes.firstjavaproject;

public class BiNumberExample {

	
	
	public static void main(String[] args) {


		BiNumber biNumber = new BiNumber(2,3);
		System.out.println("Adding " + biNumber.add());
		System.out.println("Multiplying" + biNumber.multiply());
		biNumber.doubleValue();
		System.out.println("get value " + biNumber.getNumber1());
		
		
	System.out.println(Integer.MAX_VALUE);
	}
	

}
