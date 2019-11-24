package com.class19Methods;

public class RecapMethod {
	
	
	void mult(int num1,int num2) {
		int m=num1*num2;
		System.out.println("Multiplication of num1 and num2 is "+m);
		
	}
	
	void div(int num1, int num2) {
		int d=num1/num2;
		System.out.println("Dividion of num1 and num2 is "+d);
	}
	
	void sub(int num1, int num2) {
		int su=num1-num2;
		System.out.println("Subtraction of num1 and num2 is "+su);
	}	
	
	void sum(int num1, int num2) {
		int sub=num1+num2;
		System.out.println("Sum of num1 and num2 is "+sub);
	}
	
	void sayHello(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
		
	}
	
	void gerating(String str,int times) {
		for(int i=0; i<times; i++) {
			System.out.println(str);
		}
	}
	

	public static void main(String[] args) {
		
		RecapMethod obj=new RecapMethod();
		
		obj.mult(25, 25);
		obj.div(1200, 40);
		obj.sub(300, 1200);
		obj.sum(500, 250);
		obj.sayHello(2);
		obj.gerating("Good Bye",5);
		
		
		String str="Wel Home";
		
		int num=str.length();
		
		
			
			if(num>10) {
				System.out.println("large");
			}else {
				System.out.println("small");
			}
			
			char sharc=str.charAt(7);
			System.out.println(sharc);
		}
		

	}


