package com.class10repls;

import java.util.Scanner;

public class repl77 {

	public static void main(String[] args) {
//		Write a program that creates an array of strings with the size being 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday
//		Please enter day 4 of the week
//		Wednesday
//		Please enter day 5 of the week
//		Thursday
//		Please enter day 6 of the week
//		Friday
//		Please enter day 7 of the week
//		Saturday
//
//		Hint: you will need 2 for loops but it is not nested loops. 
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter day of the week");
//		String day;
//		String [] days=new String[7]; 
//		day=scan.nextLine();
//		days[1]="Sunday";
//		days[2]="Monday";
//		System.out.print(day);
		
		
		
			 Scanner input = new Scanner (System.in);
			for (int a = 1; a<=7; a++){
			 System.out.println ("Please enter day " + a + " of the week");
			 String user = input.nextLine();
			}
			System.out.println();
			String days[] = {"Sunday", "Monday","Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"};
			for (int b = 0; b<days.length; b++){
			 System.out.println (days[b]);
			}

	}

}
