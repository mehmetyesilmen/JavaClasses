package com.class10repls;

import java.util.Scanner;

public class repl103 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    char [] arr=word.toCharArray();
	    for(char c:arr) {
    
	    	System.out.println(c);
	    }
		    
          
	}

}
