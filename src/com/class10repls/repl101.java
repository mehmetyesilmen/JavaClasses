package com.class10repls;

public class repl101 {

	public static void main(String[] args) {
		
//		Create a String with value "hello how are you". 
//		Step 1: Replace the  "h" with "t".
//		Step 2: Replace "you" with "hi".
//		Step 3: Replace  "hello how are you"  with  "i am fine".
//
//		Print out all three output.
		
		String s1= "hello how are you";
		
		System.out.println(s1.replace('h','t'));
		System.out.println(s1.replace("you","hi"));
		System.out.println(s1.replace("hello how are you" ,"i am fine"));

	}

}
