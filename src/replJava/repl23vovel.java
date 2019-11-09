package replJava;

import java.util.Scanner;

public class repl23vovel {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    int vowels=0;
	    
		for(int i=0; i<word.length(); i++) {
			
			char ch=word.charAt(i);
			if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') 
			|| (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') ) {
				
				
				System.out.print(ch+" ");
				
				vowels++;
			}
		}
		System.out.println();
        System.out.println(vowels);
	}

}
