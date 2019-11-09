package replJava;

import java.util.Scanner;

public class repl22 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("in: ");
		String word=sc.nextLine();
	    
	    for(int i=0; i<word.length(); i++) {
	    	System.out.println(word.charAt(i));
	    }
	    System.out.println();

	}

}
