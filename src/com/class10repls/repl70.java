package com.class10repls;

public class repl70 {

	public static void main(String[] args) {
		
		
		
		int c=4;
        for (int a=1; a<=c; a++) {
            for(int b=1 ;b<=c; b++) {
            if (a==1 ||b==1||a==c||b==c) {
                System.out.print("$");  
                
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        
    }
       System.out.println("!!!!");
       
        for(int i=1; i<=4; i++){
            for(int j=1; j<=8; j++){
              if(i==1 || i==4 || j==1 || j==6){
                System.out.print("$");
              }else{
                  System.out.print(" ");
              }
             }System.out.println();
           }
	}

}
