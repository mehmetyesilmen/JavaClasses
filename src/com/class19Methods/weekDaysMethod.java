package com.class19Methods;

public class weekDaysMethod {
	
	
	/** method will take a week day number 
	 * and return a week day name
	 */
	String weekDayName(int weekDay) {
		String weekDayName;
		switch(weekDay) {
		case 1:
			weekDayName="Monday";
			break;
		case 2:
			weekDayName="Tuesday";
			break;
		case 3:
			weekDayName="Wednesday";
			break;
		case 4:
			weekDayName="Thursday";
			break;
		case 5:
			weekDayName="Friday";
			break;
		case 6:
			weekDayName="Saturday";
			break;
		case 7:
			weekDayName="Sunday";
			break;
		default:
			weekDayName="Uknown";
		}
		return weekDayName;
	}
	
	

}
