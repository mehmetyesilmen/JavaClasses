package com.class15Review;

public class reviewSubstring {

	public static void main(String[] args) {
		
		//substring
		
		String longStr= "I am very happy bucause today is not Monday";
		String anotherString=longStr.substring(10);
		
		System.out.println(anotherString);
		
		System.out.println();
		
		anotherString=longStr.substring(10, 15);
		System.out.println(anotherString);
		
		
		anotherString=longStr.substring(20, 15);//that will give error
		
		
		
		
		
		

	}

}
