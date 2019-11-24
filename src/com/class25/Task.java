package com.class25;

public class Task {
	
	static void task() {
		System.out.println("I am task method with no arguments");
	}
	
	static void task(int a) {
		System.out.println("I am task method with one parameters");
	}
	
	static void task(int a,int b) {
		System.out.println("I am task method with two parameters");
		
		System.out.println("----------------------------");
	}
	
	
	
	private static void task1() {
		System.out.println("I am task1 method with no arguments");
	}
	
	private static void task1(int a) {
		System.out.println("I am task1 method with one arguments");
	}
	
	private static void task1(int a,int b) {
		System.out.println("I am task1 method with two arguments");
	}

	public static void main(String[] args) {
		
		Task obj=new Task();
		
		obj.task();
		obj.task(100);
		obj.task(10, 100);
		
		obj.task1();
		obj.task1(1);
		obj.task1(1, 2);
		
		

	}
	
	

}
