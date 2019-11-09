package com.class13;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str4=str1.concat(" world!!!");
		System.out.println(str4);
		
		
		
		String str2="Hello";
		String str3="Hello";
		
		System.out.println(str2.equals(str3));// compare content
		System.out.println(str2==str3);// compare variable
		
		System.out.println("======");
		
		String str5=new String("Bye");
		String str6=new String("Bye");
		
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
		
		
		System.out.println("======");
		
		String day="Sunday";   //print string reversely
		
		System.out.println(day.charAt(5)+" "+day.charAt(4)+" "+day.charAt(3));
		System.out.println(day.length());
		
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		
		System.out.println("=======");
		
		/*
         * Create a String and if the String is not empty perform the following: if the
         * String has an odd number of characters and has 3 or more characters, print
         * the character in the middle of the String.
         */
		
		
		String str0="Hello";
		
       
        
        int lenght=str1.length();
        int middle=str1.length()/2;
        
        System.out.println();
        if(!str1.isEmpty()) {
            if(lenght%2!=0 && lenght>=3) {
                System.out.println(str1.charAt(middle));
            
            }
            
        }
		
        String rts=("hello dear dan, how are you?");{
        	System.out.println(rts.replace('e', 'z'));
        	
        	
        }
        //replacing char
        String a="hrekrjehfe2473567%ˆ&%##%4bnrklsfu9ewiyrkrj";
        System.out.println(a.replaceAll("[0-9]", ""));
        System.out.println(a.replaceAll("[a-zA-Z]",""));
        System.out.println(a.replaceAll("[ˆa-zA-z0-9]", ""));
        System.out.println(rts.replace("how", ""));
        
        
        String b="12-22-1990";
        System.out.println(b.replace('-', '/'));
        
        
        
        
        
	}

}
