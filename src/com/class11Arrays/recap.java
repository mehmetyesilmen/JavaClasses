package com.class11Arrays;

public class recap {

	public static void main(String[] args) {
//		Create an array of cars and store 6 elements into it. Using 2 different 
//		loops print all values from the array.
		
		
		String s[]= {"bmw","mercedes","audi","toyota","honda","kia"};
		
        for(int a=0; a<s.length; a++) {
	       System.out.println(s[a]);
       }
     System.out.println("=====");
        for(String cars:s) {
        	System.out.println(cars);
       }
        System.out.println("=====");
//        Create an array on integers and calculate the sum of all elements in an array.
        
        int [] i= {1,2,3,};
        int sum=0;
        for(int k=0; k<i.length; k++) {
        	
        	
        	sum = sum+i[k];
        		
        }
        System.out.println(sum);
        
        System.out.println("=====");
//        Create an array of countries. While retrieving all values from an array
//        print capital for each country. (use 2 different loops).
        
        String [] c= {"turkey","usa","iraq","germany"};
        String [] b= {"ankara","dc","baghdad","berlin"};
        for(int l=0; l<c.length; l++) {
        	System.out.println(c[l]+" - "+b[l]);
        }
        System.out.println("====");
        for(String country:c) {
        	System.out.println(country);
        }
	}

}
