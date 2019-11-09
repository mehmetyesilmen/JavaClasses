package com.class10repls;

public class repl79 {

	public static void main(String[] args) {
//		Write a program that creates an array of integers of size 11. 
//		Add the years 2010 to 2020 to your array one by one using a for loop 
//		and then print all those values. 
//
//		Example: 
//		2010
//		2011
//		2012
//		2013
//		2014
//		2015
//		2016
//		2017
//		2018
//		2019
//		2020

		
		int [] a=new int[11]; 
		
		       a[0]=2010;
		       a[1]=2011;
		       a[2]=2012;
		       a[3]=2013;
		       a[4]=2014;
		       a[5]=2015;
		       a[6]=2016;
		       a[7]=2017;
		       a[8]=2018;
		       a[9]=2019;
		       a[10]=2020;
		       
		       for(int b=0; b<11; b++) {
		    	   System.out.println(a[b]);
		       }
		       
		}
			
		
		
	}


