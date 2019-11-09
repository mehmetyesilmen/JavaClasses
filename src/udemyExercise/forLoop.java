package udemyExercise;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		
		
//		for(int i=0; i<=100; i+=4) {
//			System.out.println("i= "+i);
//		}
//		
//		
//		
//		int fak=1;
//		
//		for(int i=1; i<=7; i++) {
//			
//			fak=fak*i;
//			
//			System.out.print(fak +" ");
//		}
//		
//		for(int i=10; i>=0; i-=2) {
//			System.out.println(i);
//		}
//		
//		int k=0;
//		
//			
//		while(k<=20) {
//			if(k==10) {
//				break;
//			}
//			
//			System.out.println("k = "+k);
//			k++;
//		}
//		
//		for(int c=0; c<=15; c++) {
//			if(c==6 || c==8 || c==12 ) {
//				continue;
//			}
//			
//				
//			System.out.print("c = "+c+" ");
//		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		
		while(true) {
			int process=scan.nextInt();	
		process++;
			if(process==8) {
				System.out.println("donguden cikiliyor");
				continue;
				
			}System.out.println("process is = "+ process);
			
			
		}
		
	}
	
	
}


