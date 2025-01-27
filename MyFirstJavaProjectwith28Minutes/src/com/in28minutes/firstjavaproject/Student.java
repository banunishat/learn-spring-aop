package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {
	
	private String name;
	//private int[] marks;
	private ArrayList<Integer> marks  =new ArrayList<Integer>();
	
/* This consstructor for Array as parameter
 * 
 * 	Student (String name, int[] marks)
	{
		this.name = name;
		this.marks = marks;
	}
	*/
	
	// this constructor for variable argument
	 
	Student (String name, int... marks)
	{
		this.name = name;
		for(int mark:marks)
			this.marks.add(mark);
	}
	
	/*
	Student (String name, ArrayList<Integer> marks)
	{
		this.name = name;
		for(int mark:this.marks)
			marks.add(mark);
	}
	
*/

	public int getNumberOfMarks() {
		
		//return this.marks.length;
		return this.marks.size();
	}
	
	public int getTtoalSumOfMarks() {
		int total=0;
		for(int mark:this.marks)
			total +=mark;
		return total;
	
	}
	public int getMaximumMark()
	{
		return Collections.max(this.marks);
	}
	
	public int getMiniumumMark()
	{
		return Collections.min(this.marks);
	}
	
	public BigDecimal getAverageMarks()
	{
		
		int total= this.getTtoalSumOfMarks();
		int totalSubjects = this.getNumberOfMarks();
		System.out.println(totalSubjects);
		return new BigDecimal(total).divide(new BigDecimal(totalSubjects),3,RoundingMode.UP);
	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" +marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	
	}
