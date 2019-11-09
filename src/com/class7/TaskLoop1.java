package com.class7;

public class TaskLoop1 {

	public static void main(String[] args) {
		
		
		/*Create a boolean variable workDay and assign true
		 * Create a boolean variable day and assign
		 * 
		 * 
		 * 
		 */
		
		
		
		boolean workDay=true;
		int day=1;
		
		
		while(workDay) {
			
			if (day==6) {
				System.out.println("I do not need a day off anymore");
				workDay=false;
			}else {
				System.out.println("I need a day off");
			}
			
			day++;
		}
		
	}

}
