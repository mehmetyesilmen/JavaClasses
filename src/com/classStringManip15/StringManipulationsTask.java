package com.classStringManip15;

public class StringManipulationsTask {

	public static void main(String[] args) {
		
		
		String str="mehmet yesilmen";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
		System.out.println(str.charAt(str.length()-1));
		
		
		
		// get substring from a string
		
		
		String s=str.substring(0, 6);
		System.out.println(s);
		String s1=str.substring(7, 15);
		System.out.println(s1);
		String s2=str.substring(7);
		System.out.println(s2);
		
		
		// replace
		
		String b="Java Classes at Sytanx Technology are awesome";
		b=b.replace("awesome", "greate");
		System.out.println(b);
		
		b=b.replace("a", "abc");
		System.out.println(b);
		
		String myString="Java Classes at Sytanx Technology are awesome";
		String [] array=myString.split("a");
		
		System.out.println(array.length);
		
		
		
		
		

	}

}
