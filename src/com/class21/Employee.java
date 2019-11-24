package com.class21;

public class Employee {
	
	
	 static String CEO;
     int salary,eID;
	
	void printInfo() {
		System.out.println("Employee id: "+eID+" salary is "+salary+" CEO is "+CEO);
	}
	

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.eID=1111;
	    emp1.salary=1000;
	    emp1.CEO="Elion";
	    
	    emp1.printInfo();
	    
	    
	    Employee emp2=new Employee();
	    emp2.eID=2222;
	    emp2.salary=2000;
	    emp2.CEO="Asel";
	    
	    emp2.printInfo();
	    
	    
	    Employee emp3=new Employee();
	    emp3.eID=3333;
	    emp3.salary=3000;
	    emp3.CEO="Sumair"; 
	    
	    emp3.printInfo();
	    System.out.println("==============================================");
	    emp1.printInfo();
	    emp2.printInfo();
	    emp3.printInfo();
	    
	    
	    
	    

	}

}
