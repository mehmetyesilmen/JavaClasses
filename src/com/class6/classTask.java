package com.class6;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
		
    Scanner input=new Scanner(System.in);
    String month;
    
    System.out.println("Enter that the month you were born");
    
    month=input.nextLine();
    
    if (month.equals("Jan") || month.equals("Feb") || month.equals("Dec")) {
    	month="Winter";
    	
    }else if(month.equals("March") || month.equals("April") || month.equals("May")) {
    	month="Spring";
    	
    }else if(month.equals("Jun") || month.equals("July") || month.equals("Aug")) {
    	month="Summer";
    	
    }else if(month.equals("Sep") || month.equals("Oct") || month.equals("Nov")) {
        	month="Spring";	
    	
    }else {
    	System.out.println("Invalid");
    	
    }
    System.out.println(month);
    System.out.println("You were born in " +month);	

	}

}
