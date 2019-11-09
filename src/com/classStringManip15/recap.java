package com.classStringManip15;

public class recap {
	
	public static void main(String [] args) {
		
		// 2 way to create string
		
		String s= "hello";
		
		String s1=new String("HELLO");
		
		System.out.println(s);
		System.out.println(s1);
		
		
		String str="mehmet";
		int length=str.length();
		System.out.println(length);
		
		str=str.toUpperCase();
		System.out.println(str);
		
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
//		String myString1=null;
//		System.out.println(myString1.isEmpty());
		
		
		
//      how to verify of characters in the string
		String a="Good evening student";
		boolean exist=a.contains("student");
		System.out.println(exist);
//      start and end with		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
