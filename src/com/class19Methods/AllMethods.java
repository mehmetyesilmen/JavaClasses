package com.class19Methods;

public class AllMethods {

	//create methods to return value of sum
		//sub
		//mult
		//div
		int sum(int num1, int num2) {
			int result=num1+num2;
			return result;
		}
		
		int sub(int num1, int num2) {
			int sub=num1-num2;
			return sub;
		}
		
		int div(int num1, int num2) {
			int div=num1/num2;
			return div;
		}
		
		int mult(int num1, int num2) {
			int mult=num1*num2;
			return mult;
		}
		
		int findLargest(int num1, int num2) {
			int largest;
			if (num1 > num2) {
				largest = num1;
			} else {
				largest = num2;
			}
			return largest;
		}
		//method to return whether number is odd
		boolean isOdd(int num) {
			boolean isOdd;
			
			if (num%2!=0) {
				isOdd=true;
			}else {
				isOdd=false;
			}
			return isOdd;
			
			
			
		}
		
		String createEmail(String firstName, String lastName, String emailType ) {
			String createEmail=(firstName+lastName+emailType);
			return createEmail;
			
			
		}
		
		boolean isPrime(int num) {
			boolean isPrime=true;
			if(num%1==0 && num%num==0) {
				isPrime=true;
			}else {
				isPrime=false;
			}
			
			return isPrime;
			
		}
		
		void getGrade(int score) {
			if(score>90) {
				score='A';
			}else if(score>80) {
				score='B';
			}else if(score>70) {
				score='C';
			}else if(score>50) {
				score='C';
			}else {
				score='F';
			}
		}//return getGrade;
		
}
