package replJava;

import java.util.Scanner;

public class repl32Fibonocci {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	   	//write your code below
	    
	    int a=0;
	    int b=1;
	    int c;
	    
	    for(int i=0; i<x; i++) {
	    	
	    	System.out.print(a+" ");
	    	
	    	c=a+b;
	    	a=b;
	    	b=c;
	    			
	    }

	}

}
