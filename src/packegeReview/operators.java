package packegeReview;

public class operators {

	public static void main(String[] args) {
		
		//Write a program to find if a number is even or odd 
	    //Print out  "My number must be even" or "My number must be odd" 
	    // Must use if else

		


		int num=8;
		int num1=num%2;
		
		if(num1==0) {
			System.out.println("My number must be odd");
			
		}else {
			System.out.println("My number must be even");
		}
		
		
		
		//Write a program to find if the largest Number of three numbers
	    //Print out  System.out.println("Largest number is " + largestNumber);
	    // Must use if then a else if and lastly else 
		
		
		int a, b, c;
		a=2;
		b=3;
		c=5;
		if(a>b && a>c) {
			System.out.println("largest number is " +a);
			
		}else if(b>c && b>a) {
			System.out.println("largest number is " +b);
			
		}else if(c>b && c>a) {
			System.out.println("largest number is " +c);
			
		}else {
			System.out.println("unknown");
		}
		
	}

}
