package InterviewQuastions;

public class quastion8 {

	public static void main(String[] args) {
		
     //print out the first 10 element of the Fibonacci series
	 // first way 	
		
		int a=1;
		int b=1;
		int c;
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.print(a+" ");
			
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		System.out.println("======");
			
	  //second way
		
	
		int k,l,m;
		
		k=0;
		l=1;
		
		for(int i=0; i<=11; i++) {
			System.out.print(k+" ");
			

			m=k+l;
			k=l;
			l=m;
			
		}
		
	}	

}


