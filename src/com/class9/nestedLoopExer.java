package com.class9;

public class nestedLoopExer {

	public static void main(String[] args) {
		
		
//		int hour=0;
//		int min=0;
//		
//		//o`clock
//		
//		for(int i=0; i<24; i++) {
//			for(int j=0; j<60; j++ ) {
//				
//				
//				if(j<10) {
//					System.out.println(i+":0"+j);
//				}else {
//					System.out.println(i+":"+j);
//				}
//			}
//			
//		}
		
//		for(int k=0; k<10; k++) {
//			for(int l=0; l<10; l++) {
//				for(int m=0; m<10; m++) {
//					for(int n=0; n<10; n++) {
//						System.out.println(k+""+l+""+m+""+n);
//						
//					}	
//				}	
//			}
//		}
		
//		for(int a=1; a<=4; a++) {
//			for(int b=1; b<=5; b++) {
//				System.out.print(b+" ");
//				
//			}
//			System.out.println();
//			System.out.println();
//		}
		
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++){
				System.out.print(x);
			}
			System.out.println();
			
		}
		

	}

}
