package com.class12;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		int []array= {2,5,4,7};
		
		for(int i:array) {
			System.out.println(i);
		}
		
       int[] arr=new int[3];
       Scanner scan=new Scanner(System.in);
       
       for(int i=0; i<arr.length; i++) {
    	   arr[i]=scan.nextInt();
    	   
       }
       for (int i=0; i<arr.length; i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
