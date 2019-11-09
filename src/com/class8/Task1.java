package com.class8;

public class Task1 {

	public static void main(String[] args) {
		
/*  write a code to find the sum of even & odd numbers
 *  from range 1 to 20
 *  expecting 2 outputs
 *  sum for odd nums.....
 *  sum for even nums....
 */
		
		
		int sum=0;
		
		for( int i=1; i<=20; i++) {
			if(i%2!=0)
			sum=sum+i;
			
		}
		System.out.println("The total of all odd numbers "+sum);
		
		
	
		int total=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2==0)
			total=total+i;	
		}
		System.out.println(" ");
		System.out.println("The total of all even numbers "+total);
		
	

	}

}
