package com.class10repls;

import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
//		Note: Create Scanner class
//
//		Write an array with size of 5. 
//		Use a loop to input values to the array (don't print any prompt message for Scanner).
//		Then print out all the elements you have created in the first loop in reverse order. 
//
//		Example: 
//		Input: 
//		1
//		2
//		3
//		4
//		5
//
//		Output:
//		5
//		4
//		3
//		2
//		1
		Scanner sc = new Scanner (System.in);
        int [] num  = new int [5];
            for (int i=0; i<5; i++){
          num[i] = sc.nextInt();
    }
        for (int i=num.length-1; i>=0; i--) {
        System.out.println(num[i]);
    } 
        
       
        	
	}

}
