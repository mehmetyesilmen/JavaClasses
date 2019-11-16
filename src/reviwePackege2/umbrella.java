package reviwePackege2;

import java.util.Scanner;

public class umbrella {

	public static void main(String[] args) {
		
		
	
		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter your grades");
//		int quiz;
//		int mid ;
//		int last;
//		
//		quiz=scan.nextInt();
//		mid=scan.nextInt();
//		last=scan.nextInt();
//		
//		int ave=((quiz+mid+last)/3);
//		
//		System.out.println("your ave is "+ave+ " and your grade is ");
//		
//		if(ave>=90) {
//			System.out.println('A');
//		}else if(ave<90 && ave>=70) {
//			System.out.println('B');
//		}else if(ave<70 && ave>=50) {
//			System.out.println('C');
//		}else {
//			System.out.println('F');
//		}
		
		System.out.println("what is the class mode today?");
		
		boolean isRain=true;
		isRain=scan.nextBoolean();
		
		if(isRain) {
			System.out.println("in class");
			isRain=scan.nextBoolean();
			System.out.println("what is the class mode today?");
		}else {
			System.out.println("online");
		}
		
		
		

		
		}
	
	 }
		
			
 
		
	
		

	
	

	
	


