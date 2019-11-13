package com.class17MethodInJava;

public class Dog {
	
	
	String name,gender,color;
	int weight,age,height;
	
	void walking() {
		System.out.println("My dog "+name+" can walk and its gender is "+gender);
	}
	
	void jumping() {
		System.out.println("My dog "+name+" can jump long and its age is "+age);
		
	}
	
	void barks() {
		System.out.println("My dog "+name+"can bark loudly and its color +color  ");
		
	}
	

	public static void main(String[] args) {
		
		
		Dog doberman=new Dog();
		
		doberman.name="fino";
		doberman.gender="male";
		doberman.color="white";
		doberman.age=6;
		doberman.weight=40;
		doberman.height=60;
		
		
		
	
		System.out.println("I have a dog.Its name is "+doberman.name+" and its gender is "+doberman.gender);
		doberman.walking();
		doberman.jumping();
		doberman.barks();

	}

}
