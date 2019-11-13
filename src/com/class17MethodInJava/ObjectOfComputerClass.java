package com.class17MethodInJava;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
		

		Computer com1=new Computer();
		
		com1.brand="Apple";
		com1.name="MacBook";
		com1.keyboard=true;
		com1.secren=15;
		com1.memory=500;
		
		
		
		Computer com2=new Computer();
		
		com2.brand="dell";
		com2.name="dell Pro";
		com2.keyboard=true;
		com2.secren=20;
		com2.memory=250;
		
		System.out.println("I am using "+com1.brand+" "+com1.name+" since years");
		
	}
	
	
	

}
