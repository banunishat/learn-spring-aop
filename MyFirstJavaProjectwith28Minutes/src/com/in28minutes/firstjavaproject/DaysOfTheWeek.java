package com.in28minutes.firstjavaproject;

public class DaysOfTheWeek {
	
	public static void main(String[] args) {
		String[] daysOfTheWeekString = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int length = daysOfTheWeekString[0].length();
		String longDay =  daysOfTheWeekString[0];
		for(int i=1;i< daysOfTheWeekString.length;i++) {
			
			if(daysOfTheWeekString[i].length() > length) {
				length = daysOfTheWeekString[i].length();
				longDay = daysOfTheWeekString[i];
			}
				
		}
		System.out.println("Longest day" +longDay );
		System.out.println("lOng length " +length);
	
	
	 for(int i=daysOfTheWeekString.length-1;i>=0;i--) {
		 System.out.println(daysOfTheWeekString[i]);
		 
	 }
	 }
}
