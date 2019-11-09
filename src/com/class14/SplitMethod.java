package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
	
		
		String str="Video provides a powerful way to help you prove your point";
		String [] array =str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("==================");
		
		String str1="Today is sunday. It is suuny day. And we are having java class";
		
		String [] array2=str1.split("\\.");
		System.out.println("The number of sentences in the given string is "+array2.length);
		System.out.println("==================");
		for(String string : array2) {
			System.out.println(string.trim());
			
			
			
		}
	}

}


