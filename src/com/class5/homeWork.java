package com.class5;

import java.util.Scanner;

public class homeWork {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean CC=input.nextBoolean();
		
		if (CC) {
			System.out.println("what is the balance on your credit card");
			int balance = input.nextInt();
			
			if(balance>1000) {
				System.out.println("Please pay off your balance");
					
			}else {
				System.out.println("You can spend more money");
			}
			
		}else{
			System.out.println("Would you like to aplay for credit card");
		}
	}

}
