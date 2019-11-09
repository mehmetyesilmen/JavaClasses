package com.class12;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		
		int [] array= {2,5,4,7,2,5,6,8,9,0,7,3,46,6};
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if (array[i]==array[j]) {
			    System.out.println(array[j]);
				}
			}
		}

	}

}
