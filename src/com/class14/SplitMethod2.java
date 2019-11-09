package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		
		
		//how to separate comma delimated string.
		
		String str= "If you come to class early, then you can study more, "
				    + "also you can learn more, and you can leave early";
		
		String [] array=str.split("\\,");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i].trim());
		}
		
		System.out.println("=======================");
		
		String str1="Welcome to Syntax Technologies";
		String [] array2=str1.split(" ",3);
		System.out.println(array2.length);
		System.out.println("=======================");
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

		System.out.println("=======================");
		
		String stra="Today we will go to school.";
		System.out.println(stra.replace(" ",""));
		
		System.out.println("=======================");
		
		String ab="89375y84yi$htjbvh#3k@#(";
	    System.out.println(ab.replaceAll("ˆ[0-9]", ""));
		
//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//How would you find out how many sentences are in that String?
		System.out.println("=======================");
		
		String a= "Is it Saturday? Is it raining? Do you have a java";
		
		String [] array1=a.split("\\?");
		
		System.out.println(array1.length);
		
	}

}
