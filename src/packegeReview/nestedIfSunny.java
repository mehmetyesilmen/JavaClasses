package packegeReview;

import java.util.Scanner;

public class nestedIfSunny {

	public static void main(String[] args) {

		
		
//		Declare boolean variable isSunny, ask user to input boolean value. 
//		Declare int temperature and prompt user to input any value. 
//
//		Your program should check:
//		if is it sunny weather or not. 
//		If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
//		If it is not sunny output should be "I stay home and practice Java"
//		If the weather is sunny you want to check the temperature. 
//		If the temperature is higher than 85 then "I am going to the beach"
//		otherwise, "I am going to the park"
//
//		Instruction: after you run your code, start inputing your values without Prompt question to appear. 
//
//		Hint: your temperature value should not be equal to 85. 	
//		
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		
		boolean isSunny=true;
		isSunny=scan.nextBoolean();
		
		if(isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
			
			int temperature;
			temperature=scan.nextInt();
			
			if(temperature>85) {
				System.out.println("I am going to the beach");
			}else {
				System.out.println("I am going to the park");
			}
			
		
		}else {
			System.out.println("I stay home and practice Java");
		}
			
	  }
			
}


