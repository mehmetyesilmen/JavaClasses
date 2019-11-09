package packegeReview;

import java.util.Scanner;

public class switchState {

	public static void main(String[] args) {
		
	
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		
		int isSwitch;
		isSwitch=scan.nextInt();
		String state = null;
		
		int isSwitch1=6;
		   
		switch(isSwitch){
		         case 0:
		           state="ZERO";
		           break;
		         case 1:
		           state="ONE";
		           break;
		         case 2:
		           state="TWO";
		           break;
		         case 6:
		           state="Not in the list";
		           break;
		       
		
		
		   }
		System.out.println(state);
	}
}