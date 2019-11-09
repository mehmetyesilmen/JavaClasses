package com.class15Review;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		
		
//		int[][] intArray = { 
//                { 2, 3, 4 }, 
//                { 4, 5, 6 }, 
//                { 6, 7, 8 }, 
//                { 8, 9, 0 } 
//            };
//        for (int row = 0; row < intArray.length; row++) {
//            for (int col = 0; col < intArray[row].length; col++) {
//                System.out.print(intArray[row][col] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Using advanced for loop");
//        for (int[] row : intArray) {
//            for (int number : row) {
//                System.out.print(number + " ");
//            }
//            System.out.println();

		
		
		
//        }
        
        //for loop
        
//        for(int i=1; i<=5; i++) {
//        	for(int k=5; k>i; k--) {
//        		System.out.print(".");
//        		
//        	}
//        	
//        	for(int j=1;j<=i; j++) {
//        		System.out.print(j);
//        	}
//        	System.out.println();
//        	 
//        }
        
//		 String str = "abracadabra alakazam";
//		    String target1 = "dab";
//		    String target2 = "ABRA";
//		    
//		    System.out.println(str.indexOf("c"));
//		    System.out.println(str.indexOf(" "));
//		    System.out.println(str.indexOf("dab"));
//		    System.out.println(str.indexOf("ABRA"));
		    
		    
		    
//		    String str = "laptops out for harambe";
//		   
//       
//		    String str1="ops out for harambe";
//		    String str2="s out";
//		    
//		    //fill in the blanks below:
//		    System.out.println(str.substring(5)); 
//		    System.out.println(str.substring(7, 10)); 
//		    
//		    System.out.println(str.substring(16,23)); //fill in substring so it prints "harambe"
//		    System.out.println(str.substring(10, 13)); //fill in substring so it prints "t f"
		
//		Scanner inp = new Scanner(System.in);
//	  	System.out.print("In:");
//	  	String str = inp.nextLine();
//	    // Don't change the code above! Write your code below
//	    
//	  	
//	  	System.out.println(str.subSequence(0, 3));
	  	
//		Scanner inp = new Scanner(System.in);
//	  	System.out.print("In:");
//	  	int num = inp.nextInt();
//	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
//	  	
//	  	if(num>0){
//	  	  System.out.println(num +" is positive");
//	  	}else{
//	  	  System.out.println(num +" is negative");
//	  	}
	  	
//      reverse	  	
//	  	String s= "yesilmen";
//	  	
//	  	int len=s.length();
//	  	
//	  	String rev="";
//	  	
//	  	for(int i=len-1;  i>=0; i--) {
//	  		rev=rev+s.charAt(i);
//	  		
//	  		  
//	  	}
//	  	   System.out.println(rev);
	  	
//	  	 Scanner inp = new Scanner(System.in);
//	     System.out.print("In:");
//	     int end = inp.nextInt();
//	     //write your code below
//	     
//	     for(int i=0; i<=end*2-1; i++){
//	       System.out.print(i+" ");
//	       
//	     }	
//	     
//	     Scanner inp = new Scanner(System.in);
//	     System.out.print("In:");
//	     String word = inp.nextLine();
//	     
//	     
//	     char [] array=word.toCharArray();
//	     
//	     for(char ch:array) {
//	    	 System.out.println(ch);
//	     }
//		
		String str="yesilmen";
		
		for(int i=0; i<str.length(); i++) {
			  char ch=str.charAt(i);
			  System.out.print(ch+" ");
			    
		}
		
		System.out.print("======== ");
		
		String s="yesilmen";  
		   
		for(int k=s.length()-1;   k>=0;  k--) {
			char c=s.charAt(k);
			System.out.print(""+c+" ");
		}
		
	     
	   
	}

	
}			


