package com.class7;

import java.util.Scanner;

public class homeworkCoffee {

	public static void main(String[] args) {
		
		 /*You need to ask user to pay for coffee
		  *You need to keep asking user to pay for it until 
		  * entered price is equal 5
		  * after user paid then say "Enjoy your coffee"
		  */
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		int price;
			System.out.println("Please pay for your coffee");
		
		price=scan.nextInt();
		
		while(price!=5) {
			System.out.println("You have given "+ price + " dollars");
			price++;
		
		}
		System.out.println("Enjoy your coffee");
		
    }
}