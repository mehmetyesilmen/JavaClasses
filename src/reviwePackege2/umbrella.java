package reviwePackege2;

import java.util.Scanner;

public class umbrella {

	public static void main(String[] args) {
		
		
		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
//		
//		for(int i=20; i>=1; i--) {
//			if(i%2==0)
//			System.out.println(i);
//		}
		
//		int sumEvens=0;
//		int sumOdds=0;
//		
//		for(int i=0; i<=20; i++) {
//			
//			if(i%2==0) {
//			sumEvens=sumEvens+i;
//			
//			}else {
//				sumOdds=sumOdds+i;
//			}
//			
//		  }
//		System.out.println(sumEvens);
//		System.out.println(sumOdds);
		
		
//		for(int i=0; i<=20; i++) {
//			if(i>=5&&i<=15 ) {
//			continue;
//			}
//			System.out.println(i);
//		}
//		
//		for(int i=0; i<=50; i++) {
//			if(i%3==0) {
//				
//			System.out.println(i);
//			
//			}
//			
//			
//		}
		String card;
		Scanner scan=new Scanner(System.in);
		
		for(int i=1; i<=10; i++){
			System.out.println("apply for card");
			card=scan.nextLine();
			if(card.equals("yes")) {
				break;
			}
			
		}
		
	}
		
}
	
	

	
	


