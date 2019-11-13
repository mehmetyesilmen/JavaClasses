package com.class10repls;

public class repl106 {
	
	String color,make;
	int model;
	
	
//	create a class named 'Main' with specific attributes.
//
//	For you to do:
//
//	Create two objects in which you will be assigning the following values.
//	carColor='Black'
//	carModelYear=2019
//	carName='BMW'
//
//	carColor='White'
//	carModelYear=2018
//	carName='Toyota'
//
//	Car color is Black and car model year is 2019 and car name is BMW
//	Car color is White and car model year is 2018 and car name is Toyota
	
	

	public static void main(String[] args) {
		
		repl106 car=new repl106();
		
		car.color="black";
		car.make="BMW";
		car.model=2019;
		
		repl106 car1=new repl106();
		
		car1.color="white";
		car1.make="Toyota";
		car1.model=2018;
		
		System.out.println("Car color is "+car.color+" and car model year is "+car.model+" and car name is "+car.make);
		System.out.println("Car color is "+car1.color+" and car model year is "+car1.model+" and car name is "+car1.make);
		

	}

}
