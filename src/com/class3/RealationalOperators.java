package com.class3;

public class RealationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("*********** "   );
		
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("###########");
		
		
		int a=90;
		int a1=30;
		
		if(a>a1) {
			
		System.out.println("a is larger than a1");
		
		}	else {
			System.out.println("a is smaller than a1");
			
		}
			
			int expectedHours=15;
			int actualHours=20;
			
			//if expected hours are  more than actual ->you will succeed
			//otherwise, please study more
			
			if (actualHours>expectedHours) {
				System.out.println("you will succeed");
				
			}else {
				System.out.println("please study more");
			}		
		
	}
}
