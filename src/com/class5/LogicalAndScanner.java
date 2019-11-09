package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		
		/* ask user to enter age
		 * if age is from 1 to 3 --> you are baby
		 * if age is from 3 to 5 --> you are toodler
		 * if age is from 5 to 12--> you are a kid
		 * if age is from 12 to 19 --> you are teenager
		 * if age is more than 20 --> you are an adult
		 */
		
		int age=13;
		
		if (age>=1 && age<=3) {
			System.out.println("You are a baby");
			
		}else if(age>=3 && age<=5) {
			System.out.println("You are todler");
			
		}else if(age>=5 && age<=12) {
			System.out.println("You are a kid");
			
		}else if(age>=12 && age<=19) {
			System.out.println("You are teenager");
			
		}else if(age>20) {
			System.out.println("You are an adult");
			
		}else {
			System.out.println("invalid age");
		}
		
		
		int age1;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		if (age>=1 && age<=3) {
			System.out.println("You are a baby");
			
		}else if(age>=3 && age<=5) {
			System.out.println("You are todler");
			
		}else if(age>=5 && age<=12) {
			System.out.println("You are a kid");
			
		}else if(age>=12 && age<=19) {
			System.out.println("You are teenager");
			
		}else if(age>20) {
			System.out.println("You are an adult");
			
		}else {
			System.out.println("invalid age");
		}
	}

}
