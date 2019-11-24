package com.class20Methods;

public class RecapMethods {
	
	void PrintTwice(String str) {
		for(int i=0; i<2; i++) {
			System.out.println("Don't make me say this twice!");
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		RecapMethods str=new RecapMethods();
		
		str.PrintTwice(null);
		
		
//		Step 1:create a method "PrintTwice" that should take a String as a single parameter
//
//		Step 2:Write the logic for that method print two statements twice 
//
//		Step 3: call the method ONLY once within the main method and pass the String value as 
//		"Don't make me say this twice!"
//
//		Output:
//		Don't make me say this twice!
//		Don't make me say this twice!
	}

}
