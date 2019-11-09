package com.class10repls;

public class repl86 {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			    };
			
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		
		for(int i = 0; i < a[i].length; i++) {
			sum1+=a[0][i];
		}
		System.out.println(sum1);
		
		for(int i = 0; i < a[i].length; i++) {
			sum2+=a[1][i];
			
		}
		System.out.println(sum2);
		
		for(int i = 0; i < a[i].length; i++) {
			sum3+=a[2][i];
		
		}
		System.out.println(sum3);
		
		for(int i = 0; i < a[i].length; i++) {
			sum4+=a[3][i];
		
		}
		System.out.println(sum4);

	}

}
