package com.class11Arrays;

public class homeWorkArray {

	public static void main(String[] args) {
//		Create a 2D array of integer type with 3 rows and 4 columns 
//		and print all values of the whole array.

       int [][]array= {{1,2,3,4},{2,3,4,5},{4,5,6,7}};
       
       for(int a=0; a<array.length; a++) {
    	   for(int b=0; b<=array.length; b++) {
    		   System.out.print(array[a][b]);
    	   }
    	   System.out.println();
       }

//       Create an array of cars : american, german, korean, italian. 
//       Then retrieve all values from that array
       
       
       
       String []arr= {"american","german","korean","italian"};
       for(int a=0; a<arr.length; a++) {
    	   System.out.println(arr[a]);
       }
       
//       Create an array of countries: north america countries, south america countries, 
//       europe countries, asian countries, african countries. 
//       Then print all values from that array.
       
       String [][]country= {{"usa","canada"},{"mexico"}};       
	}

}
