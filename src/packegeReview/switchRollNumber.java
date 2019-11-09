package packegeReview;

import java.util.Scanner;

public class switchRollNumber {

	public static void main(String[] args) {
		

		
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		
		int number;
		String student;
		number=scan.nextInt();
		
		switch(number) {
		case 101:
			student="Student name: Ramesh ";
			break;
		case 102:
			student="Student name: Mahesh ";
			break;
		case 103:
			student="Student name: Mukesh ";
			break;
		default:
			student="Not found Student name: in Class";
			break;
		}
		System.out.println(student);
	}

}
