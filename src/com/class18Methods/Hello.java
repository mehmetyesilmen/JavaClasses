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
		obj.sayNameAndAge("John", 25);
		obj.isSnowing(false);
		obj.isSnowing(true);
		obj.largerNumber(40,40);
		obj.oddOrEven(20);
		obj.oddOrEven(25);
		
		
	    }
	
	//method to say age and name
	
	void sayNameAndAge(String name, int age) {
		
		System.out.println("My name is"+ name+ " and I am" +age +"years old");
		
	}
	
	// create a method that will check if it snowing
	// if snow --> stay at home, otherwise go for a walk
	
	void isSnowing(boolean isSnowing) {
		
		if(isSnowing) {
			System.out.println("Stay at home");
			
		}else {
			System.out.println("Go for a walk");
		}
	  }
	void largerNumber(int first, int second){
		
		if(first>second) {
		   System.out.println("The larger number is "+ " "+first);
			
		}else if(first<second) {
			System.out.println("The larger number is "+ " "+second);
			
		}else {
			System.out.println("The numbers are equals");
		}
		
	}
	
	void oddOrEven(int numbers){
		
		
		if(numbers%2==0) {
			System.out.println("The number is  even and it is "+numbers);
		
		}else {
			System.out.println("The number is odd and it is "+numbers);
		}

	}
	
	
}


