package com.class10repls;

import java.util.Scanner;

public class repl99 {
	
//	If browser is ChRoME it should print the: 
//		"Proceed with Chrome browser"
//
//		If browser is FireFOX it should print the: 
//		"Proceed with Firefox browser"
//
//		If browser is IE it should print the:
//		"Proceed with IE browser"
//
//		If any other browser it should print the:  
//		"Invalid browser"

	public static void main(String[] args) {
		
		
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("Enter the browser name to proceed further with execution");
	  String browser = sc.nextLine(); 
	  
	  if(browser.equals("Chrome")) {
		  System.out.println("Proceed with Chrome browser");
		  
	  }else if(browser.equals("Firefox")) {
		  System.out.println("Proceed with Chrome browser");
		  
	  }else if(browser.equals("IE")) {
		  System.out.println("Proceed with IE browser");
		  
	  }else {
		  System.out.println("Invalid browser");
	  }
	  
	  }
}
