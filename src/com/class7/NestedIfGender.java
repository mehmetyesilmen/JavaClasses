package com.class7;

import java.util.Scanner;

public class NestedIfGender {

	

	public static void main(String[] args) {
		

	Scanner scan;
	scan=new Scanner(System.in);
	        System.out.println("Please enter your gender");
	String gender;
	
	gender=scan.nextLine();
			System.out.println("Please enter your age");
	int age;
	age=scan.nextInt();
	
	if (age>25) {
		if(gender.equals("M")) {
			System.out.println("Man");
			
		}else if(gender.equals("F")) {
		    System.out.println("Woman");
	}
		
	}else {
		if(gender.equals("M")) {
			System.out.println("Boy");
			
		}else if(gender.equals("F")) {
		    System.out.println("Girl");
	   }
		
	  }
	
   }  
}
