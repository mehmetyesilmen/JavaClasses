package com.class10repls;

import java.util.Scanner;

public class repl104 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
//	    for (int i=0; i<word.length(); i+=2){
//	        System.out.print(word.charAt(i));
//	      }
	    
	    for(int i=0; i<word.length(); i+=2) {
	    	System.out.print(word.charAt(i));
	    	
	    }
	    

	}

}
