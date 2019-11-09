package packegeReview;

import java.util.Scanner;

public class switchScanner {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of the child");
		
		
		
		int age;
		String action;
		age = scan.nextInt();
		
		switch (age) {
		case 1:
			action="you can crawl";
			break;
		case 2:
			action="you can talk";
			break;
		case 3:
			action="you can dance";
			break;
		case 4:
			action="you can get trouble";
			break;
		default:
	        action="I do not know who are you";
			break;

		}
		
		System.out.println(action);
		
	}
	
}
