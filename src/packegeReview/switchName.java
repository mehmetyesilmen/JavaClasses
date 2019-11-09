package packegeReview;

import java.util.Scanner;

public class switchName {

	public static void main(String[] args) {

		
		
		
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		
		String name, action;
	    name=scan.nextLine();
	    
		switch(name) {
		case "Shiva":
			action="Will take care of Java Assignment";
	        break;
		case "Sandish":
			action="Will take care of SDLC Assignment";
	        break;  
		case "Wegas":
			action="Will take care of Selenium Assignment";
	        break; 
		case "Asel":
			action="Will take care of every Assignment";
	        break;   
	    default:
	    	action="Invalid instructor selected";
		}
		System.out.println(action);
	}

}
