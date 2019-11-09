package packegeReview;

public class TaskswitchStatement {

	public static void main(String[] args) {
		
		
		//Task 1
		//Write a program that will use a switch statement to display what month we're in.


		 
		//Task 2
		// Write a program to found out the user level of experience 
				        // Must use a switch statement with  a String variable named levelString and a int variable named level 
				        // Beginner level should be 1
				        // Intermediate level should be 2
				        // Expert level should be 3
	
		
		int number=3;
		String month;
		
		switch (number) {
		case 1:
			month="jan";
			break;
		case 2:
			month="feb";
			break;
		case 3:
			month="march";
			break;
		case 4:
			month="april";
			break;
		case 5:
			month="may";
			break;
		case 6:
			month="jun";
		    break;
		case 7:
			month="jul";
			break;
		case 8:
			month="aug";
			break;
		case 9:
			month="sep";
			break;
		case 10:
			month="oct";
			break;
		case 11:
			month="nov";
			break;
		case 12:
			month="dec";
			break;
		default:
			month="invalid";
			break;
				
		}
		
        System.out.println("We are in "+month);
	}

}
