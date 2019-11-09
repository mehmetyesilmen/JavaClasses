package com.class6;

public class switchStatement {

	public static void main(String[] args) {
		
		
		/* 7 weekdays
		 * if day==-->monday
		 * if day==-->tuesday
		 */
		
		int day=2;
		String weekDay;
		
	
		if(day==1) {
			weekDay="monday";
			
		}else if(day==2){
			weekDay="tuesday";
		}else if(day==3){
			weekDay="wednesday";
		}else if(day==4){
			weekDay="thursday";
		}else if(day==5){
			weekDay="friday";
		}else if(day==6){
			weekDay="saturday";
		}else if(day==7){
			weekDay="sunday";
				
		}else {
			weekDay="invalid";
		}
		
		System.out.println(day);
		
		
		
		switch(day) {
		case 1: 
			weekDay="monday";
			break;
		case 2:
			weekDay="tuesday";
			break;
		case 3:
			weekDay="wednesday";	
			break;
		case 4:
			weekDay="thursday";	
			break;
		case 5:
			weekDay="friday";
			break;
		case 6:
			weekDay="saturday";
			break;
		case 7:
			weekDay="sunday";
			break;	
		default:
			weekDay="invalid";
		}
		
		System.out.println(weekDay);
	}

}
