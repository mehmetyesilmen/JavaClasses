package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		
		String apply;
		
		
		for( int q=1; q<=10; q++) {
			System.out.println("Are you apply to a credit card");
			
			apply=scan.nextLine();
			
			if (apply.equals("Yes")) {
				break;
				
			}
		}
		

	}

}
