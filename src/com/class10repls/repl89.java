package com.class10repls;

public class repl89 {

	public static void main(String[] args) {
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
         int sum=0;
         
         for(int i=0; i<a.length; i++) {
        	 for(int j=0; j<a[i].length; j++) {
        		 if(i%2==0 || j%2==0) {
        			 sum=sum+a[i][j];
        			 
        		 }
        		 
        	 }
        	 
         }
         System.out.println(sum);
         
         int even=0;
         for(int i=0;i<a.length;i++) {
             for(int j=0;j<a[i].length;j++) {
            	 if((i%2==0||j%2==0)) {
                     even=even+a[i][j];
                 }
                 
             }
         }
         System.out.println(even);
	}

}
