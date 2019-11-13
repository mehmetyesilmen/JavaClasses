package com.class18Methods;

public class Hello {
	
	
	void sayHello(String name) {
		
		System.out.println("Hello "+name);
		
		
	}
	
	public static void main(String [] args) {
		
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Waqas");
		obj.sayHello("Diego");
	}

}
