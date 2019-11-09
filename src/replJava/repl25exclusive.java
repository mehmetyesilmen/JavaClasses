package replJava;

import java.util.Scanner;

public class repl25exclusive {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
		
	    for(int i=1; i<=x*2-1; i++) {
	    	System.out.println(i);
	    }
	    

	}

}
