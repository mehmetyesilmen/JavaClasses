package replJava;

import java.util.Scanner;

public class repl30Reverse {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    
	    for(int i=s.length()-1; i>=0; i--) {
	    	char ch=s.charAt(i);{
	    		System.out.print(ch);
	    	}
	    }

	}

}
