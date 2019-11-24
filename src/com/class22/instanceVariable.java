package com.class22;

public class instanceVariable {
	
	String name;
	String LastName;
	String name1;
	

	public static void main(String[] args) {
		
		
		
		String name1="burcu";
		System.out.println(name1);
		
		instanceVariable obj=new instanceVariable();
		System.out.println(obj.name1);
		obj.name1="halil";
		System.out.println(obj.name1);
		obj.isSnowing();
		obj.Large(45, 23);
		obj.oddOrEven(51);
		obj.isPolindrome("hasan");
		obj.isPolindrome("aya");
		
		
		
		instanceVariable human1=new instanceVariable();
		human1.name="john";
		human1.LastName="smith";
		
		
		instanceVariable human2=new instanceVariable();
		human2.name="mehmet";
		human2.LastName="yesilmen";
		human2.LastName="yesil";
		
		System.out.println(human1.name);
		System.out.println(human2.LastName);

	}
	 
	void isSnowing() {
		
		boolean isSnow=false;
		
		if(isSnow) {
			System.out.println("Stay at home");
			
		}else {
			System.out.println("Go for walk");
		}
		
	}
	
	void Large(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println(num1+" or num1 larger");
		}else {
			System.out.println(num2+" or num2 is larger");
		}
	}
	
	void oddOrEven(int num) { 
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
	
	void isPolindrome(String word) {
		String reverse="";
		
		for(int i=word.length()-1; i>=0;i--) {
			reverse=reverse+word.charAt(i);
			}
			if(word.equals(reverse)) {
				System.out.println(  "The string is polindrome");
			}else {
				System.out.println("The string is NOT polindrome");
			
		}
		
		
	}

} 
