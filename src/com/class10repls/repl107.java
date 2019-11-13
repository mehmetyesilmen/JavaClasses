package com.class10repls;

public class repl107 {
	
	String breed,name,color;
	
	void bark() {
		System.out.println(name+" can bark");
	}
	
	void run() {
		System.out.println(name+" can run");
	}
	
	void play() {
		System.out.println(name+" can play");
	}
//	Create a Class Main that should be a template for the DogClass. 
//	In this class, you should specify the following attributes: breed, 
//	name, color, and following behaviors: bark(), run(), play().
//	Create 3 different objects of it: Husky, Bulldog, Labrador with 
//	specific attributes and behaviors.
//
//	The output of the program should be as following:
//	 
//	Husky can bark
//	Husky can run
//	Husky can play
//	Bulldog can bark
//	Bulldog can run
//	Bulldog can play
//	Labrador can bark
//	Labrador can run
//	Labrador can play

	public static void main(String[] args) {
		
        repl107 dog1=new repl107();
		
		dog1.name="Husky";
		
		repl107 dog2=new repl107();
		
		dog2.name="Bulldog";
		
		repl107 dog3=new repl107();
		
		dog3.name="Labrador";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		dog3.bark();
		dog3.run();
		dog3.play();
		
		


	}

}
