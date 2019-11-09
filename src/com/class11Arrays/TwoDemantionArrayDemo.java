package com.class11Arrays;

public class TwoDemantionArrayDemo {

	public static void main(String[] args) {
		
		String [][] names= {
				{"khan","yousuf","alex","zeynep"},
				{"muhammed","ann","ali","huseyin"},
				{"diego","asif","zubayir","serif"},
					
		};	
		
       int lengthOfRows=names.length;
       System.out.println(lengthOfRows);
       
       int lengthOfCols=names[0].length;
       System.out.println(lengthOfCols);
       
       for(String getArrays[]:names) {
    	   for(String getNames:getArrays) {
    		   System.out.print(getNames+" ");
    	   }
    	   System.out.println();
       }
       
	}

}
