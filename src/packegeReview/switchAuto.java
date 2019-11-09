package packegeReview;

import java.util.Scanner;

public class switchAuto {

	public static void main(String[] args) {
		

			
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		
		String car, origin;
		car=scan.nextLine();
		
		switch(car) {
		
		case "BMW":
			origin="german car";
			break;
		case "Toyota":
			origin="japanese car";
			break;
		case "Maserati":
			origin="italian car";
			break;
		default :
			origin="unknown";
			break;
		
		
		}
		
		System.out.println("Your favorite car is " +origin);
	}

}
