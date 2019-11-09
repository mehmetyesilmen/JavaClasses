package replJava;

import java.lang.reflect.Array;

public class exery {

	public static void main(String[] args) {
//		ALL print statements in this exercise should be on one line, no newlines.
//
//		Print out the character in the 5th index of the String str
//		Print out the character in the 8th index of the String str
//		Print out the character in the 1st index of the String str
//		Print out the index in the i-th index of the String str (i is a variable already 
//				declared for you)
		
		
		
     	String str="boopity bop";
		
		int size=str.length();
		for(int i=0; i<str.length(); i++) {
		char []c= {'b','o','o','p','i','t','y',' ','b','o','p'};{
			System.out.print(c[5]+""+c[8]+""+c[1]+""+size);
		}
		
		}
	}

}
