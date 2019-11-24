package com.class24;

public class Country {

   String CountryName;
   String CountryCapital;
   int CountryPopulation;
   static boolean CountryFlag;
   int NumOfCity;
   
   Country(String CountryName,String CountryCapital,int CountryPopulation, boolean CountryFlag,int NumOfCity){
	   this.CountryName=CountryName;
	   this.CountryCapital=CountryCapital;
	   this.CountryPopulation=CountryPopulation;
	   this.CountryFlag=CountryFlag;
	   this.NumOfCity=NumOfCity;
	   
   }
   
   void displayInfo() {
	   System.out.println("My country is "+CountryName+" the capital is "+CountryCapital+" "
	   		+ "the population is around "+CountryPopulation+" the number of the cities is "
		    +NumOfCity+" "+ "and it has honurable flag "+ CountryFlag);
   }
   
  public void productivity(String product) {
	   System.out.println(CountryName+" is producty country in " +product);
   }
   
   

}
