package com.class2;

public class StringConcatenation {
	public static void main(String[] args) {
		String name="Anna";
		//Display in consoleGood morning Anna
		System.out.println("Good morning "+ name);
		
		int day =22;
		//Today is September
		System.out.println("Today is September "+ day);
		
		String text="Today is September ";
		System.out.println(text + day);		
		
		String fruit="banana";
		char dollar='$';
		double price=1.99;
		
		// The price of banana is $1.99
		
		
		System.out.println("The price of "+ fruit+ "is" +dollar + price );
		
	}

}
