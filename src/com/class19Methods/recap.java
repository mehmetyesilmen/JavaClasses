package com.class19Methods;

public class recap {
	
	void sum(int num1,int num2) {
		int c=num1+num2;
		System.out.println("The sum of 2 numbers is = "+c);
	}
	
	// create a method to display hello 5 times
	
	void sayHello(int times) {
		for(int i=0; i<times; i++) {
			System.out.print("Hello"+" ");
		}
	}
	
	void saySomething(String word,int times) {
		for(int i=0; i<times; i++) {
			System.out.print(word+" ");
		}
	}
	
	public static void main(String[] args) {
		recap obj=new recap();
		obj.sum(40,50);
		obj.sayHello(5);
		obj.saySomething("mehmet", 3);
		

	}
	
	
}