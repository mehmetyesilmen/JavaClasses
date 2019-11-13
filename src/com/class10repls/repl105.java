package com.class10repls;

public class repl105 {
	
	String name;
	int roll_no;
	
	
	
//	Create a class named 'Main' with String variable 'name' 
//	and integer variable 'roll_no'. 
//
//	Creating an object of the class Main 
//	and assign value of 2 to roll_no and name as "John"
//
//	Your program should print the following:
//	Name is John and roll number is 2

	public static void main(String[] args) {
		
		repl105 name1=new repl105();
		
		name1.name="John";
		name1.roll_no=2;
		
		System.out.println("Name is "+name1.name+" and"+" roll number is "+name1.roll_no);
		

	}

}
