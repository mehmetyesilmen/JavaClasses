package com.class10repls;

import java.util.Scanner;

public class homeworkLoop {

	public static void main(String[] args) {
		
		
//		for (int a=5; a>=1; a--) {//rows
//			for(int b=1; b<=a; b++) {//colums
//				System.out.print(b);
//			}
//			System.out.println();
//		}

		Scanner scan=new Scanner(System.in);
		System.out.println("Please guess my number");
		int secretNumber, guessNumber;
		
		secretNumber=12;
		
		
		
		do {
			System.out.println("Please guess my number");
			guessNumber=scan.nextInt();
			
		if(guessNumber<secretNumber) {
			System.out.println("Your number is too small");
			
		}else if(guessNumber>secretNumber) {
			System.out.println("Your number is too large");
		}
		
	
	}while(guessNumber!=secretNumber);
	
	System.out.println("Congratulations");
	
	
	
	
}

}