package com.class10repls;

public class repl112 {
//	
//	1. create a method as forLoop and write the logic in the method body 
//  to print numbers from 1 to 10
//	2. Call the method in the main method
//
//	Expected Output:
//	1
//	2
//	3
//	4
//	5
//	6
//	7
//	8
//	9
//	10
	
	void forLoop() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		
		repl112 print=new repl112();
		
		print.forLoop();
		

	}

}
