package com.class7;

public class DoWhile {

	public static void main(String[] args) {
	
		
		//mostly used
		
		int num=3;
		
		while (num<=7) {
			System.out.println("hello");
			num++;
		}
		System.out.println("+++++++++++++++++++++++++++");
		//rare
		
        int num1=6;
		do {
			System.out.println("bye");
			num1++;
		}while(num1<=7); {
			
			
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		int num2=20;
		
		while(num2<=50) {
			if(num2%2==0)
			System.out.println(num2);
			num2++;
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		int even=20;
		
		do {
			
			System.out.println(even);

			even+=2;
			
		}while(even<=50);
	}
}
