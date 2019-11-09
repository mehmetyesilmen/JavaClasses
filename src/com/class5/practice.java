package com.class5;

public class practice {

	public static void main(String[] args) {
		
		
		int num1=40;
		int num2=20;
		
		if(num1==num2) {
			System.out.println("The numbers are equale");
		}else {
			System.out.println("The numbers are not equale");
			
			if(num1>num2) {
				System.out.println("num 1 bigger than num2");
				
			}else if(num1<num2) {
				System.out.println("num 1 smaller than num2");
			}
			
			
			}
		int num3=55;
		int num4=65;
		
		if(!(num3==num4) || num3>num4) {
			System.out.println("num3 and num4 are not equale and num3 is bigger");	
		}else {
			System.out.println("The numbers are equale");
		}

	}

}
