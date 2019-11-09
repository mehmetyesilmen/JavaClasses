package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
	
		int day=8;
		
		if (day==1 || day==5) {
			System.out.println("no class");
			
		}else if(day==2 || day==4) {
			System.out.println("sdlc class");
			
		}else if(day==3) {
			System.out.println("review class");
			
		}else if(day==6 || day==7) {
			System.out.println("java class");
			
		}else {
			System.out.println("not day valid");
		}
		
	}

}
