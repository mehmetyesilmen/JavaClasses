package reviwePackege2;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
//		int start;
//		int end;
//		
//		System.out.println("Please enter the start number");
//		start=scan.nextInt();
//		System.out.println("Please enter the end number");
//		end=scan.nextInt();
//		
//		
//		int sumOfEven = 0;
//		int sumOfOdd  = 0;
//		
//		for(int i=start; i<end; i++) {
//			if(i%2==0) {
//				sumOfEven=sumOfEven+i;
//				
//			}else {
//				sumOfOdd=sumOfOdd+i;
//				
//			}
//			
//		}
//		System.out.println(sumOfEven);
//		System.out.println(sumOfOdd);
//		
//		
//		System.out.println("-------------------------------");
		
		
		int secret=20;
		int guess;
		
		
		do {
			System.out.println("Please enter the secret number");
			guess=scan.nextInt();
		if(guess>secret) {
			System.out.println("The number is too large");
			
		}else if(guess<secret) {
			System.out.println("The number is too small");
		}	
		}while(guess!=secret);
			System.out.println("Congratulations");
		
		
	  
	}

}