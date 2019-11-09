package com.class10repls;

public class repl85 {

	public static void main(String[] args) {
//		Write a program that checks if a 2-D integer array is a square array, meaning, 
//		if its rows and columns are equal.
//
//		Hint:

				int[][] a = {
					{1,1,1},
					{1,1,1},
					{1,1,1}
//				    
				};
		 
		
		int rows=0;
		int cols=0;

		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				cols=j;
			}
			rows=i;
		
		}
		
		if(a[rows]==a[cols]) {
			System.out.println("true");
		}
			
	}

}
