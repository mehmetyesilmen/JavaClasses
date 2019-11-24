package com.class21;

public class Student {
	
	public String studentName;
	public int studentID;
	public static int numberOfStudent;
	
	

	public static void main(String[] args) {
		
		Student std1=new Student();
		std1.studentID=1;
		std1.studentName="aaa";
		std1.numberOfStudent++;
		
		
		Student std2=new Student();
		std2.studentID=2;
		std2.studentName="bbb";
		std2.numberOfStudent++;
//		
//		
		Student std3=new Student();
		std3.studentID=2;
		std3.studentName="bbb";
		std3.numberOfStudent+=2;
//		
		
		
		
		
		
//		System.out.println("The total number of student is: "+Student.numberOfStudent);
//		System.out.println("The total number of student is: "+numberOfStudent);
//		System.out.println("The total number of student is: "+std1.numberOfStudent);
		
		System.out.println("The name of the student "+std1.studentName+" The total number of student is: "+std1.numberOfStudent);
		System.out.println("The name of the student "+std2.studentName+" The total number of student is: "+std2.numberOfStudent);
		System.out.println("The total number of student is: "+std3.numberOfStudent);
		
	}

}
