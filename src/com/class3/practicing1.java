package com.class3;

public class practicing1 {

	public static void main(String[] args) {
		
		int i1=36;
		int i2=66;
		
		if (i1>i2) {
			System.out.println("i1 is larger than i2");
		
		}else if(i1>=i2) {
			System.out.println("i1 is equale to i2" );
				
		}else {
			System.out.println("i1 is smaller than i2");
				
		}
		System.out.println("*********************");
        double d=25.25;
        double d1=50.50;
        
        double d2=75.75;
        
        if (d>d1) {
        	System.out.println("d is smaller to d1");
        	
        }else if(d2==(d1+d)) {
        	System.out.println("d2 is equal to sum of d1 and d2");
        	
        }else {
        	System.out.println("no value is equal to another");
        }
        
        int coffeePrice=6;
        int avaliablePrice=9;
        
        System.out.println("*********************");
        if (coffeePrice>avaliablePrice) {
        	System.out.println("I am not going to buy coffee");
        	
        }else {
        	System.out.println("I am going to buy my coffee and enjoy it");
        }
        System.out.println("#####################");
        
        double d5=4.2;
        double d6=4.2;
        double d7=8.4;
        
        if (d5!=d6) {
        	System.out.println("d5 is NOT equal to d6");
        	
        }else if(d7==(d5+d6)) {
        	System.out.println("d7 is equal to sum of d5 and d6 ");
        	System.out.println("This is the correct answer");
        	
        }else {
        	System.out.println("There is no equality");
        }
        System.out.println("heeeyyyyyy!!!!!!!!!!!!!!!");
        System.out.println(d7+(d5-d6));
	}

}
