package com.class6;

import java.util.Scanner;

public class hw35 {

	public static void main(String[] args) {
		
		
		Scanner scan;
		boolean credit;
		int score;
		
		
		scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		
		credit=scan.nextBoolean();
		if (!credit) {
			System.out.println("I do not need a loan");
		}
		else {
			System.out.println("What is your credit score?");
			score=scan.nextInt();
			
			if(score<600) {
				System.out.println("Not eligible");
				
			}else if(score>=600 && score<700) {
				System.out.println("Maybe eligible");
				
			}else if(score>=700 && score<800) {
				System.out.println("Eligible");
				
			}else if(score>=800) {
				System.out.println("Definitly eligible");
				
			}else {
				System.out.println("Unknown");
			}
			
			System.out.println("The eligibility is " +score);			
		}
		 
		
	}
			
		
}
      

	


