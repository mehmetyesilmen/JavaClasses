package com.class10repls;

public class repl81 {

	public static void main(String[] args) {
//		Write a program that creates an array of integers that stores the following 
//		values{45, 78, 12,  67, 52, 89, 23, 77, 88}. 
//		Print the values using a for loop starting at index 1 and increment by 3, 
//		and then print value divided by its index.
//
//		Output:
//		78 13 11 


		
		
		
		int []arr={45, 78, 12,  67, 52, 89, 23, 77, 88};
		for(int a=1; a<=9; a+=3) {
		
			System.out.print(arr[a]/a+" ");
			
		}
	}

}
