package com.class13;

public class Max2DArray {

	public static void main(String[] args) {
		
		int [][] b= {
				{2,3,5},
				{2,4,7},
				{8,1,9},
				{3,5,1}
		        };
		
		int max=b[0][0];
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				if(b[i][k]>max){
					max=b[i][k];
					System.out.println(max);
					
				}
			}
			
		}System.out.println("-------------------");
		
        System.out.println("Maximum number is "+ max);
        
        System.out.println("--------------------");
        int [][] a= {
				{2,3,5},
				{2,4,7},
				{8,1,9},
				{3,5,1}
		        };
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				sum+=b[i][k];
				
			}
		}
		System.out.println("Sum of all rows is "+sum);
        
        System.out.println("-------------------");
        
        
        sum=0;
        int row= 1;
        for(int k=0; k<b[row].length; k++) {
        	sum+=b[row][k];
        	
        }
        
        System.out.println("Sum of row 1 is "+ sum);
	}

}
