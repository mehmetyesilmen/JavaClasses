package com.class25;

public class CanWeOverload {
	
	// can we overload a private method ? - yes
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	} 
	
	//can we overload main method? - yes
	
	public static void main() {
		System.out.println("I am a main method with String arguments");
	}
	
		
	public static void main(String str) {
		System.out.println("I am a main method with 2 parameters ");
	}
	public static void main(String str,String[] args) {
		System.out.println("I am a main method with string of array and String str  ");
		
	}
	
	public static void main(String[] args) {
		System.out.println("I am a main method with string of array  ");
		main("mehmet");
		main();
	}
		
	
	
	

}
