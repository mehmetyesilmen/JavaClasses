package com.class10repls;

public class repl88 {

	public static void main(String[] args) {
		
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			    };
		
		int colSum=0;
		for(int i=0; i<a.length; i++) {
			colSum+=a[i][1];
			
		}
		System.out.println(colSum);

	}

}
