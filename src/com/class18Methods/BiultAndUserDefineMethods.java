package com.class18Methods;

import java.util.Scanner;

public class BiultAndUserDefineMethods {

	public static void main(String[] args) {
		
		
		//built in
		
		String str="Hello";
		System.out.println(str);
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		

		Scanner scan=new Scanner(System.in);
		scan.hasNextLine();
		
		//user defined method
		
		BiultAndUserDefineMethods obj=new BiultAndUserDefineMethods();
		obj.myMethod();
		

	}
	// WE CANNOT CREATE A METHOD INSIDE ANOTHER METHOD !
	void myMethod()//method header 
	{
		System.out.println("This is user defined method that I created");
		

	}

}
