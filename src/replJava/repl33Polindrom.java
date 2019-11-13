package replJava;

import java.util.Scanner;

public class repl33Polindrom {

	public static void main(String[] args) {
		
//		A palindrome means that the characters are the 
//		same forwards and backwards, ignoring spaces.
//
//		Examples of palindromes:
//		racecar
//		was it a car or a cat I saw
//		never odd or even
//		rats live on no evil star
//
//		Your check should be case insensitive too.  For example,
//		"Bob" is a palindrome, despite the first B being capitalized.
//
//		Your program will print out "true" if it's a palindrome and "false" if not.
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		   	//write your code below
		    
		    
		    String rev="";
		    int len=s.length();
		    boolean isPol=true;
		    
		    for(int i=s.length()-1; i>=0; i-- ) {
		    	rev=rev+s.charAt(i);
		    	
		    	
		    }
		    
		    
		    
		    
		    System.out.println(rev.replace(" ", ""));
		    
		    System.out.println(rev.toLowerCase());
		    
		    if(s.equals(rev)) {
		    	System.out.println(isPol);
		    	
		    
		    }else {
		    	System.out.println("false");
		    }
		    
		    
	}

}
