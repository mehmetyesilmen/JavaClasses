package com.class17MethodInJava;

public class Car{
	
	// define attributes features
	
	String make, model,color;
	int year,wheels,windows,speed;
	
	//adding behavior/ action-->methods();
	
	void drive() {
		System.out.println("I am the drive method");
		System.out.println("Car "+make+" can drive");
		System.out.println();
	}
	
	void star() {
		System.out.println("I am the start method");
		System.out.println("Car "+make+" can start");
		System.out.println();
	}
	
	void accelarate(){
		System.out.println("I am the accelarate method");
        System.out.println("Car "+make+" "+model+" "+year+" can accelarate");
        System.out.println();
		
	}

}
