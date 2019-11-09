package packegeReview;

import java.util.Scanner;

public class nestedTemp {

	public static void main(String[] args) {
		
		
        //Write a program that prints out if it is good weather to go for a bike ride. The weather is good 
		//if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. 
		//If temperature is less than 60 program should say
        //it is too cold, if the temperature is more than 100, program should say it is too hot.
		//If the temperature is between 40 degrees and 80 degrees inclusive & no
		    // * rain--> we will go for hiking otherwise--> we will not go hiking
		//If temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		   //  * otherwise we are not going snowboarding it
		//if temperature is more than 80 & sunny--> go to the beach otherwise --> not go to the beach*/
		
		Scanner scan;
		int temp;
		scan=new Scanner(System.in);
	
		System.out.println("What is the temperature of the weather?");
		temp=scan.nextInt();
		
		if(temp>=60 && temp<100) {
			System.out.println("The weather is good ");
			
			if(temp>=40 && temp<=80) {
				System.out.println("We will go for hiking");
				
			}else {
				System.out.println("we will not go hiking");
			}
		
		}else {
			System.out.println("The temperature is bad to go out");
			
			if(temp<60) {
				System.out.println("It is too cold");
				
			}else if(temp>100) {
				System.out.println("It is too hot");
				
			}
			
		}
		
	}

}
