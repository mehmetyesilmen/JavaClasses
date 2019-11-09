package com.class15Review;

public class reviewReplace {
	
	public static void main(String []args) {
		
		//replace
		
				String longStr="I am very happy bucause, today is not Monday .";
				
				String anotherStr=longStr.replace('a', 'e');
				
				System.out.println(anotherStr);
				
				anotherStr=longStr.replace(' ', '|');

				System.out.println(anotherStr);
				
				System.out.println(anotherStr);
				
				anotherStr=longStr.replace('a', 'e').replace('M','E');
				
				System.out.println(anotherStr);
				
				anotherStr=longStr.replace("," , "");
				
				System.out.println(anotherStr);
				
				anotherStr=longStr.replaceAll("[a-z]" , "0");
				
				System.out.println(anotherStr);
				
                anotherStr=longStr.replaceAll("[a-z]" , "1").replaceAll(" ","0").replaceAll(",", "=");
				
				System.out.println(anotherStr);
				
				
				
				
				
				
				
				
				
		
		
		
	}

}
