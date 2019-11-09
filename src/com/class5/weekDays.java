package com.class5;

public class weekDays {

	public static void main(String[] args) {
		

		int weekDays=7;
		
		if(weekDays>=1 && weekDays<=5) {
			System.out.println("it is weekdays");
		
		}else if(weekDays==6 || weekDays==7) {
			System.out.println("it is weekend");
			
		}else {
			System.out.println("invalid day");
		}
		

	}

}
