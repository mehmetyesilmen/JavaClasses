package com.class10repls;

public class repl94 {
//	Print out the position of the first occurrence of "c".
//	Print out the position of the first occurrence of " ".
//	Print out the position of the first occurrence of the variable target1.
//	Print out the position of the first occurrence of the variable target2.

//  Note: the output should be one per line. 
	
	
	public static void main(String[] args) {
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    
	    System.out.println(str.indexOf('c'));
	    System.out.println(str.indexOf(" "));
	    System.out.println(str.indexOf("dab"));
	    System.out.println(str.indexOf("ABRA"));

	}

}
