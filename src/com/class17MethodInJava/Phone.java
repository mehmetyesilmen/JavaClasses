package com.class17MethodInJava;

public class Phone {
	
	String brand,name,color;
	int secren,memory,cost;
	
	void typing() {
		System.out.println("I can type with my "+name);
	}
	
	void talking() {
		System.out.println("I can talking with my "+name);
	}
	
	void accessingWeb() {
		System.out.println("I can acces the internet with my "+name);
	}

	public static void main(String[] args) {
		
		Phone mob1=new Phone();
		mob1.brand="iphone";
		mob1.name="Xmac";
		mob1.color="silver";
		mob1.secren=7;
		mob1.memory=120;
		mob1.cost=800;
		
		Phone mob2=new Phone();
		mob2.brand="samsung";
		mob2.name="edge";
		mob2.color="black";
		mob2.secren=7;
		mob2.memory=140;
		mob2.cost=600;
		
		Phone mob3=new Phone();
		mob3.brand="nokia";
		mob3.name="xxxx";
		mob3.color="white";
		mob3.secren=8;
		mob3.memory=150;
		mob3.cost=400;
		
		
		System.out.println("I used "+mob1.brand+" "+mob1.name+" for five years");
		mob1.typing();
		mob1.talking();
		mob1.accessingWeb();
		
		System.out.println();
		
		System.out.println("I used "+mob2.brand+" "+mob2.name+" for five years");
		mob2.typing();
		mob2.talking();
		mob2.accessingWeb();
		
		System.out.println();
		
		System.out.println("I used "+mob2.brand+" "+mob2.name+" for five years");
		mob3.typing();
		mob3.talking();
		mob3.accessingWeb();

		

	}

}
