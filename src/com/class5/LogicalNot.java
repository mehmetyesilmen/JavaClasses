package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
	
		
		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("hello");
			
		}else {
			System.out.println("bye");
		}
       
		boolean isRain=false;
		
		if (!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("no umbrella");
		}
		
		int num1=10;
		int num2=20;
		
		if (num1==num2) {
			System.out.println("numbers are equale");
			
		}else {
			System.out.println("numbers are not equale");
			
		if (!(num1==num2)) {
			System.out.println("numbers are not equale");
			
		}else {
			System.out.println("numbers are equale");
		}
		
		String name1="Helen";
		String name2="july";
		
		if (!(name1.equals("Mary") || name2.equals("Anna"))){
			System.out.println("You are not my sister");
			
		}else {
			System.out.println("You are my sister");
			
	    }
		
		
		
		}
	}
}
