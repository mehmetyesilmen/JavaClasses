package com.class6;

public class Recap {
	
	public static void main(String [] args) {
		
		
		int time=10;
				
		String timeOfDay;
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
			
		}else if(time>=12 && time<=15) {
			timeOfDay="Noon";
			
		}else if( time >=16 && time <=20) {
			timeOfDay="Evening";
			
		}else if( time>20) {
			timeOfDay="Night";
			
		}else {
			timeOfDay="Unknown";
		
		}
		System.out.println(timeOfDay);
		
	    if (timeOfDay.equals("Morning")) {
	    	System.out.println("Good Morning");
	    }	
		
	}

}
