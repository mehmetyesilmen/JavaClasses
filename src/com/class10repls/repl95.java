package com.class10repls;

public class repl95 {
	
	
//	Output 1: print str starting at index 5 and going till the end.
//	Output 2:  print str starting at index 7 and ending at index 10.
//	Output 3: print "harambe". This must not be a new string, must be from str.
//	Output 4: print "t f". This must not be a new string, must be from str. 
//
//	Note: all outputs should be one per line
	
	
	public static void main(String[] args) {
		
		String str="laptops out for harambe";
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,10));
		System.out.println(str.substring(16,23));
		System.out.println(str.substring(10,13));
	}

}
