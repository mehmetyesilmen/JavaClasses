package com.class13;

public class TwoD_Array {

	public static void main(String[] args) {
	
		
		int [][] a= new int[3][4];
		
		a[1][2]=3;
		a[2][1]=5;
		
		for(int row=0; row<a.length; row++) {
			System.out.println("row"+ row+"-->");
			for(int col =0; col<a[row].length; col++) {
				
				
				int val=a[row][col];
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}
