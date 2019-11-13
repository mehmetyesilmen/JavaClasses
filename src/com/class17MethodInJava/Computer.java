package com.class17MethodInJava;

public class Computer {
	
	
	String brand,name;
	boolean keyboard;
	int secren,memory;

	
	//define behavior,actions
	
	void playGames() {//method header 
		//method body
		System.out.println("I can play on my "+name);
		
	}
	
	void javaCoding() {
		System.out.println("I can do java coding on my "+name);
		
	}
	
	
	void watchMovie() {
		System.out.println("I can do watch movie on my "+name);
	
    }
	//////////////////////////////////////////////////////////////
	
	//using main method to execute the code
    public static void main(String[] args) {
		
    	

		Computer com1=new Computer();
		
		com1.brand="Apple";
		com1.name="MacBook";
		com1.keyboard=true;
		com1.secren=15;
		com1.memory=500;
		
		
		
		Computer com2=new Computer();
		
		com2.brand="dell";
		com2.name="D Pro";
		com2.keyboard=true;
		com2.secren=20;
		com2.memory=250;
		
		///////////////////////////////////////////////////////////////////////////////
		
		System.out.println("I am using "+com1.brand+" "+com1.name+" since years!!!!!");
		System.out.println("I have " +com1.brand+" "+com1.name+" ///");
		com1.javaCoding();
		com1.watchMovie();
		com1.playGames();
		System.out.println();
		System.out.println("I am using "+com2.brand+" "+com2.name+" "+ "since years!!!!!");
		System.out.println("I have " +com2.brand+com2.name+" ///");
		com2.javaCoding();
		com2.watchMovie();
		com2.playGames();
	}
    

}