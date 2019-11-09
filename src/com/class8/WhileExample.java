package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*Let ask user to enter if it is raining or not true-false
		 * as long as it is rain tell user to take an umbrella
		 * as soon as there is no rain-->you can go to park
		 */
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		boolean isRain;
		
		do {
			System.out.println("Is it raining?");
		    isRain=scan.nextBoolean();
		    
		}while(isRain);
              System.out.println("Go to the park.");
	}

}
