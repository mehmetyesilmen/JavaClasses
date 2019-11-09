package com.class6;

import java.util.Scanner;

public class hw36 {
	

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);	
	
	System.out.println("Please enter two strings");
	String word1=input.nextLine();
	String word2=input.nextLine();	
	
	System.out.println("Please enter two numbers" );
    int num1=input.nextInt();
	int num2=input.nextInt();
	
	
	int num3;
	if(word1.equals(word2) && num1==num2) {
		System.out.println("AND");
		
	}else if(word1.equals(word2) || num1==num2) {
		System.out.println("OR");
		
	}else {
		System.out.println("NONE");
		
	}
	
	}

}
