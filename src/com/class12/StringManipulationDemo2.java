package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
	
		// .contains
		String sen=("It is raining");
		String sentence ="It was raining";
		
		System.out.println(sentence.contains("was"));
		System.out.println(sen.equals(sentence));
		
		
		        /*
		         * .contains();
		         * This method  searches the sequence of characters in the string.
		         * If the sequences of characters are found,
		         * then it returns true otherwise returns false.
//		         */
//		        String sentence=“It was raining”;
//		        String sen=“raining”;
//		        System.err.println(sen.contains(sentence));
//		        
//		        System.out.println(sentence.contains(“was”));
		        
		        // Create two Strings and initaialize them with some value.
		        //implement the following methods on those strings.
		        
		        /*
		         * sen.length();
		         * sen.equals();
		         * sen.contains(s);
		         * sen.toUpperCase();
		         * sen.toLowerCase();
		         * sen.equalsIgnoreCase(anotherString);
		         */
		        
	   System.out.println(sentence.endsWith("raining"));
	}

}
