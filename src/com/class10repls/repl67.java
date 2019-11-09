package com.class10repls;

import java.util.Scanner;

public class repl67 {

	public static void main(String[] args) {
//	    Write a for loop that will print out the numbers starting at 0 and 
//	    ending at twice of the end variable exclusive. 
//      Each number should be on the same line, separated by a space. 
		
//		Scanner inp = new Scanner(System.in);
//	    System.out.print("Int:");
//	    int end = inp.nextInt();
//	    
//	    
//	    
//	    for(int i=0; i<end*2; i++ ) {
//	    	System.out.print(i+ " ");
//	    	
//	    }
	    Scanner input = new Scanner(System.in);
	       int[] arr = new int[5];
	       for (int i=0;i<arr.length;i++) {
	    	   arr[i] = input.nextInt();
	       }
	       for (int i=0;i<arr.length;i++)
	       {
	           System.out.println(arr[i]*10);
	       }

	}

}
