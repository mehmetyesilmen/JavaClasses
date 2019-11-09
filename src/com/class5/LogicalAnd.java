package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 */
    
		int num=40;
		
		if (num>1 && num<10) {
			System.out.println("this number is small");
		}else if(num>10 && num<100){
			System.out.println("this number is mideum");
		}else if(num>100 && num<1000) {
			System.out.println("this number is large");
		}else {
			System.out.println("this number is out of range");
		}
			
		
	}

}
