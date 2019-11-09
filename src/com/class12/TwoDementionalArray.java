package com.class12;

public class TwoDementionalArray {

	public static void main(String[] args) {
		
       int [][] array=new int [2][3];

//     first row
       
       array[0][0]=9;
       array[0][1]=10;
       array[0][2]=11;
       
       
//     second row
       array[1][0]=10;
       array[1][1]=10;
       array[1][2]=10;
       
       for(int i[]:array) {
    	   for(int j:i) {
    		   System.out.print(j+" ");
    	   }
       }
       System.out.println();
       System.out.println("=================");
       
       int [][]array1= {
    		   {44,55,66},
    		   {11,22,33},
       };
       for(int []is:array1) {
    	   for(int is2:is) {
    		   System.out.print(is2+" ");
    	   }
       }
	}

}
