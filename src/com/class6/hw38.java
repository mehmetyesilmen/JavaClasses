package com.class6;

import java.util.Scanner;

public class hw38 {

	public static void main(String[] args) {
		
	
		Scanner scan;
		boolean weekend;
		String subject;
		
	
		
		scan=new Scanner(System.in);
		
		System.out.println("Is it weekend?");
		weekend=scan.nextBoolean();
		
		if(!weekend) {
			//System.out.println("manual testing");
		subject = "manual testing";
			
		}else {
			//System.out.print("we will be learning today");
			subject="java";
		}
//		System.out.println("Today we will be learning " +subject);
	}

}
