package com.class10repls;

public class ArrayIntro {

	public static void main(String[] args) {
		
        //first way
		char [] grade=new char[4];
		
		grade [0]='A';
		grade [1]='B';
		grade [2]='C';
		grade [3]='D';
		
		System.out.println("I a" + "m in grade " +grade[0]);
		
		
		// second way
		
	    char [] grades = {'A','B','C','D','E','F'};
	    
	    int a=3;
	    
		System.out.println("My grade is "+ grades[3]);
		System.out.println(grades[3]);
		
		a--;//3
		System.out.println(grades[a]);
		
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+ " ");
		}
		
		
		//first way
		String [] names=new String[6];
		
		names[0]="Mehmet";
		names[1]="Bilal";
		names[2]="Samuel";
		names[3]="Ridvan";
		names[4]="Turker";
		names[5]="Harun";
		
		System.out.println(names[3]+ " is member of our group");
		
		//second way
		
		String []animals= {"cat","dog","cow","snake","elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+ " ");
		}
		
		String [] words=new String[5];
		
		words[0]="java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="Is";

	
		System.out.println(words[1]+" "+ words[4]+" "+ words[0]+" "+ words[3]+" "+ words[2]);

		
		
		double [] value=new double[5];
		
		value [0]= 1.1;
		value [1]= 2.2;
		value [2]= 3.3;
		value [3]= 4.4;
		value [4]= 5.5;
		
		
		for(int i=0; i<value.length; i++) {
		System.out.print(value[i]+" - ");
		
		}
		//Create an array of countries. While retrieving all values from an array 
		//print capital for each country.
		
//		String [] country= {"USA","RUSIA","TURKEY","IRAQ","GERMANY"};
//		
//		for(int i=0; i<country.length; i++) {
//			
//			if(country[i].equals("USA")) {
//				System.out.println("WASHINGTON DC");
//			}else if(country[i].equals("RUSIA")) {
//				System.out.println("MOSCOVA");
//			}else if(country[i].equals("TURKEY")){
//				System.out.println("ANKARA");
//			}else if(country[i].equals("IRAQ")){
//				System.out.println("BAGHDAD");
//			}else if(country[i].equals("GERMANY")){
//				System.out.println("BERLIN");	
//		}else {
//			System.out.println("unknown");
//		}
		
		
			String[] country= {"Turkey","USA","Greek","France","Spain"};
	        String[] city= {"Ankara","Washington","Athens","Paris","Barcelona"};
	        for(int i=0; i<city.length; i++) {
	            System.out.print(country[i]+": ");
	            System.out.println(city[i]);
	        }
		
		
	}

}
