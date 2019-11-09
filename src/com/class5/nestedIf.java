package com.class5;

public class nestedIf {
	
	public static void main(String [] args) {
		System.out.println("Please enter the value");
		
		boolean isDisplayed=true;
		String button="Sign in";
		
		if (isDisplayed) {}
		   System.out.println("button is displayed");
		   
		   if (button.equals("Sign in")) {
			   System.out.println("Test case pass");
			   
		   }else{
			   System.out.println("Wrong is not displayed");
		   }
		   
		
	}

}
