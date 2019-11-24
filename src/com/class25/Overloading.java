package com.class25;

public class Overloading {
	
	void area (int num1){
		System.out.println("I am a regtangle with area "+num1*num1);
		
	}
	
	void area (int num1, int num2){
		System.out.println("I am a square with area "+num1*num2);
		
	}
	
	void area (int num1, int num2,int num3){
		System.out.println("I am a box with area "+num1*num2*num3);
		
	}

	public static void main(String[] args) {
		
		
		Overloading area=new Overloading();
		
		area.area(5);
		area.area(2, 10);
		area.area(2, 5, 10);

	}

}
