package com.class12;

public class stringManipulation {

	public static void main(String[] args) {
	
		
		//There are two ways to create string objects
		//1
		// String Literal
		
		String name="Jhon";
		System.out.println(name);
		System.out.println(name.length());
		
		//2
		//CreateString with new key word 
		String name1=new String("John1");
		
		String str1="Hello Word";
		System.out.println("before :"+str1);
		str1=str1.toLowerCase();
		System.out.println("after :"+str1);
		
		System.out.println("=================");
		
		//.equals()
        //This method will count everything such
        //capitalization and content
		
		String str2="HEllo WoRLd";
		
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
        //This method does not care for capitalization and compare the
        //content only
        System.out.println(str1.equalsIgnoreCase(str2));
        
		
		
		 /*
         * toUpperCase();
         * This method converts all of the characters in
         * this String to uppercase
         */
		
		System.out.println("==================");
		String str3="Mohammed";
		System.out.println("before: "+str3);
		str3=str3.toUpperCase();
		System.out.println("after: "+str3);
		
		
		
		
		
		
		
		

	}

}
