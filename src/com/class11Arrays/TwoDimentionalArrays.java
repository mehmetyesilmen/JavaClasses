package com.class11Arrays;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		String[][] array=new String[2][3];
		
//		1rs row
		array[0][0]="mehmet";
		array[0][1]="ali";
		array[0][2]="hasan";
//		2nd row
		array[1][0]="mersin";
		array[1][1]="istanbul";
		array[1][2]="ankara";
		System.out.println(array[0][1]);
		System.out.println(array[1][2]);
		int [][] nums= {{1,2,3,4,},{9,8,7,6,2},{5,3,6,7}};	
		System.out.println(nums[1][2]);
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);
	}

}
