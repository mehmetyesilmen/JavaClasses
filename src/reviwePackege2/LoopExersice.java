package reviwePackege2;

import java.util.Scanner;

public class LoopExersice {

	public static void main(String[] args) {
		
//		int x=1;
//		
//		while(x<20) {
//			System.out.println("The value of x is " +x);
//			x++;
//		}
//..........................................................................		
//		int time=8;
//
//		if (time < 12) {// condition is true
//			System.out.println("Good morning");// code executes 1
//			}
//			System.out.println("-------------------------");
//			while (time < 12) {// while condition is true
//			System.out.println("Good morning");
//			time++;
//			}
//			//I want to print GA 5 times
//			int i=-1;
//			while(i<4) {
//			System.out.println("Good afternoon");
//			i++;
//			}
//			System.out.println("Outside of while loop");
//............................................................................			
//		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
//		
//			boolean workDay = true;
//			int day = 1;
//			while (workDay) {
//			if (day == 6 || day==7) {
//			workDay = false;
//			System.out.println("I do not need a day of anymore");
//			}else {
//			System.out.println("I need a day off");
//			}
//			day++;
//			}
//............................................................................
			  //	Task One	
			/* print only even numbers from 1 to 20 */
			
			
			//Task Two
			/* how to print numbers from 5 to 25 inclusive all in 1 line with space in
			         * between?
					 
					 
					 //Task Three 
		 
		 
		 */
			/* Prompt the user to ask the name 3 times and print "Hello____" */

			
//.................................................................			
//			int a= 1;
//			while(a<=20) {
//				if(a%2==0) {
//					System.out.println(a);	
//				}
//				a++;
//			}
//			
//.................................................................		
//			int z=5;
//			
//			while(z<=25) {
//				System.out.print(" " +z);
//				z++;
//			}
//.................................................................			
//			Scanner scan=new Scanner(System.in);
//			System.out.println("What is your name?");
//			String name;
//			name=scan.nextLine();
//			
//			int c=1;
//			while(c<4) {
//			System.out.println("Hello " +name);
//			c++;
//			} 
//		
//		int num = 10;
//		while (num <= 7) {
//		System.out.println("Hello");
//		num++;
//		}
//		// rare
//		int num1 = 10;
//		do {
//		System.out.println("Bye");
//		num1++;
//		} while (num1 <= 7);
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
//		// print even numbers from 20 to 50 using do while
//		// 1 way
//		int even = 20;
//		do {
//		System.out.println(even);
//		even += 2;
//		} while (even<=50);
//		System.out.println("-------------Second way---------");
//		// 2 way
//		int even1 = 20;
//		do {
//		if (even1 % 2 == 0) {
//		System.out.println(even1);
//		}
//		even1++;
//		} while (even1 >= 50);
		
	//   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is not equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  

		
		
//		int a=1;
//		
//		do {
//			System.out.println(a);
//			if(a%2!=0);
//			a+=2;
//		}while(a<15);
//		
//		
//		
//		Scanner scan=new Scanner(System.in);
//		
//		int answer;
//		
//		do {
//			System.out.println("pay for candy");
//			answer=scan.nextInt();
//			
//		}while(answer!=3);
//		System.out.println("enejoy your candy");
//		
//		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//		
//		for (int i=0;    i<=4;           i++) {
//			System.out.println("Good morning");
//			}
//		
//			//print numbers from 1-10;
//			for (int i=1; i<=10; i++) {
//			System.out.println(i);
//			}
//			
//			//print numbers from 10-1
//			for (int i=10; i>=1; i--) {
//			System.out.println(i);
//			}
			
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
			break;
			}
			System.out.println(i);
			}
			System.out.println("**********************");
			// continue - it will skip CURRENT iteration
			for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
			continue;
			}
			System.out.println(i);
			}
			System.out.println("*******************");
			// I want to print nums from 1 to 20 except 5,6,7
			for (int a = 1; a <= 20; a++) {//5
			if (a >=5 && a<=17) {
			continue;
			}
			System.out.println(a);

			}
		
		}
		
	}
	

 
