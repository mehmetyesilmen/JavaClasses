package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		
		String str="Syntax";
		
		str.toCharArray();
		System.out.println(str.toCharArray());
		
		System.out.println("======");
		
		char [] array= str.toCharArray();
		for(char i:array) {
			System.out.println(i);
		}
		System.out.println("======");
		System.out.println(array);
		
		

		
		
		
	}

}
