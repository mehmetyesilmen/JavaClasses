package InterviewQuastions;

public class quastion7 {

	public static void main(String[] args) {
		
		
	//	Write a java program to check whether a given number is prime or not?

		
		int num=7;
		boolean isPrime=true;
		
		
		if(num==0 || num==1) {
			isPrime=false;
		}else {
		
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
				
			   }
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is prime number");
			
		}else {
			System.out.println(num+" is not prime number");
		
		}
	}

}
