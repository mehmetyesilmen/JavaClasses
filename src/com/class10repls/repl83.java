package com.class10repls;

public class repl83 {

	public static void main(String[] args) {
		int[][] num = {
				{5,2,3,7},
			 	{1,5,2,2},
				{1,2,3,4}
				
			};
		int rowtotal=0;
		
		for(int i=0; i<=num.length; i++) {
			rowtotal+=num[2][i];
			
		}
		System.out.println(rowtotal);
	

	}

}
