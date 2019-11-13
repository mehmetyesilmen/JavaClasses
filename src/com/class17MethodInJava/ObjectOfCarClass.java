package com.class17MethodInJava;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		
		//to create an object syntax is
		//ClassName variable=new ClassName
		
		Car car1=new Car();
		
		car1.make="Tesla";
		car1.model="S3";
		car1.color="black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
		//Accessing behavior for 1 object 
		car1.drive();
		car1.accelarate();
		car1.star();
		System.out.println();
		System.out.println("I have drive "+car1.make+ " "+ car1.model);
		
		System.out.println("--------------------");
		Car car2=new Car();
		
		car2.make="BMW";
		car2.model="X5";
		car2.color="white";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=5;
		car2.speed=250;
		
		//Accessing behavior for 1 object 
		car2.drive();
		car2.accelarate();
		car2.star();
		
		//car2.make="Mercedes";
		System.out.println();
		System.out.println("I have drive "+car2.make+ " "+ car2.model);


		
	}  

}
