package com.class10repls;

public class repl74 {

	
		
	public static void main(String[] args) {
//
//		Write a program that creates an array of integers that stores the following 
//		values: 45,78, 12,  67, 55, 89, 23, 77, 88
//		Print only values that stored with even index including 0.

		int nums[]= {45,78,12,67,55,89,23,77,88};
		
		for(int i=0; i<=nums.length; i+=2)
		
		System.out.print(nums[i]+" ");

		
		
	}

}
