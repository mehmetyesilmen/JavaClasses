package com.class10repls;

public class repl110 {
	
	
//	1. Create a method name as newLine that should have print statement 
//	inside the method body as "newLine method implementation"
//	1. Create a method name as displayLine that should have print statement
//	inside the method body as "displayLine method implementation"
//	3. Call both methods
//
//	Expected Output:
//	newLine method implementation
//	displayLine method implementation
	
	void newLine() {
		System.out.println("newLine method implementation");
	}
	
	void displayLine() {
		System.out.println("displayLine method implementation");
	}

	public static void main(String[] args) {
		
		repl110 call=new repl110();
		
		call.newLine();
		call.displayLine();
		

	}

}
