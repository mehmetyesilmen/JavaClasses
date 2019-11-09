package packegeReview;

import java.util.Scanner;

public class nestedIfMercedes {

	public static void main(String[] args) {
		
		//Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read "Save up money and wait until next year"



      Scanner scan;
      int salary;
      String audi, benz, jaguar, tesla;

      scan=new Scanner(System.in);
      System.out.println("What is your salary?");
      
      salary=scan.nextInt();
      
      if(salary<50000) {
    	  System.out.print("You should buy a used car. ");
  	     
  	     
      }else{
    	  System.out.println("You can buy new brand car");
      
          }if(salary>=50000 && salary<70000) {
    		  System.out.println("You can buy audi");
    		  
    	  }else if(salary>=70000 && salary<80000) {
    		  System.out.println("You can buy benz");
    		  
    	  }else if(salary>=80000 && salary<90000) {
    		  System.out.println("You can buy jaguar");
    		  
    	  }else if(salary>=90000 && salary<100000) {
    		  System.out.println("You can buy tesla");
    		  
	     }	

      }
	
}