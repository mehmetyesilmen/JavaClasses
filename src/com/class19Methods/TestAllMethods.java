package com.class19Methods;

public class TestAllMethods {
	
	public static void main(String[] args) {
		//find the largest from 300 and 500
		//then identify is the largest number is odd
		
		AllMethods obj=new AllMethods();
		
		int large=obj.findLargest(300, 500);
		    System.out.println(large);
		boolean odd=obj.isOdd(large);
		    System.out.println(odd);
		String email=obj.createEmail("mehmet", "yesilmen", "@gmail.com");
			System.out.println(email);
		boolean num1=obj.isPrime(5);
		    System.out.println(num1);
		
	}

}
