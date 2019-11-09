package com.class12;

public class SingleArrayRecap {

	public static void main(String[] args) {
		
		
		int []array=new int[4];
		array[0]=12;
		array[1]=13;
		array[2]=14;
		array[3]=15;
		
		System.out.println(array[2]);
		
		for(int s=0; s<array.length; s++) {
			System.out.println(s);
			System.out.println(array[s]);
		}
//      for each loop
		System.out.println("=========");
		for(int i:array) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
