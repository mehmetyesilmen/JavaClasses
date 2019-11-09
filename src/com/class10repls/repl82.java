package com.class10repls;

public class repl82 {

	public static void main(String[] args) {
//		double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};
//			
//			//Double and print array
//		
//		for(int i=0; i<a.length; i++){
//		  for(int k=0; k<a[i].length; k++){
//		    System.out.print(a[i][k]*2+" ");
//		  }
//		  System.out.println();
//		}
		
		
		
//		int[][] num = {
//				{5,2,3,7},
//				{1,5,2,2},
//				{1,2,3,4}
//				
//				
//			};
//		int rowtotal=0;
//		
//		for(int i=0; i<=num.length; i++) {
//			rowtotal+=num[2][i];
//			
//		}
//		System.out.println(rowtotal);
//		
		
//		int [] array= {66,3,5,6,1,7,9,5,33,5,77,8,55,34,65,78,43,24};
//		
//		int largest=array[0];
//		
//		for(int i=0; i<array.length; i++) {
//			if(array[i]>largest) {
//				largest=array[i];
//			}
//			System.out.println("The larger number in array is: "+largest);
//		}
		
		
		
		
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			    };
			
		int rowSum=0;
		
		for(int i = 0; i < a.length; i++) {
			rowSum+=a[i][0];
		}
		System.out.println(rowSum);
		
	 }
	
	
}


