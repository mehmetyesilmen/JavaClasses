package com.class4;

public class mortgage {

	public static void main(String[] args) {
	
	
	double rate=3.5;
	
	int price=450000;

	
	if (rate>4.5) {
		System.out.println("I will not buy a house");
	
	}else {
		System.out.println("Will consider buying");
		
		if (price>400000) {
			System.out.println("I will take a loan");
			
		}else {
			System.out.println("I will pay cash");
		}
		
	}
	
	}

}
