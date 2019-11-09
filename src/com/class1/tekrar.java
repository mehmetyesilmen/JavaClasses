package com.class1;

import java.util.Scanner;

public class tekrar {

	public static void main(String[] args) {
		
		
     Scanner scan=new Scanner(System.in);
     int secret, guess;     
     secret=13;
     
     do {
    	 
    	 System.out.println("please enter guess number");
    	 guess=scan.nextInt();
    	 
    	 if(secret>guess) {
    		 System.out.println("the number is too small");
    		 
    	 }else if(secret<guess) {
    		 System.out.println("the number is too large");
    		 
    	 }else {
    		 System.out.println("conratulation you got it");
    	 }
    	 
    	
     }while(secret!=guess);
     
     
	}

}
