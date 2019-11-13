package InterviewQuastions;

public class javaquiz {

	public static void main(String[] args) {
		
		int nums[] = { 12, 15, 16, 17, 19 ,13,10};

//		   for (int i = nums.length-1; i >=0; i--) {
//
//		      System.out.print(nums[i] +" ");
//		     
//		    }
		   
		   
		   int top=0;
		   for(int a=0; a<nums.length; a++) {
			   top+=nums[a];
		   }
		   System.out.println(top);
		   
		   
//         System.out.println("========");
//		   
//		   int i = 50;
//
//		   int[] a = new int[10];
//		   System.out.println(a.length);
//
//		   a = new int[100];
//		   System.out.println(a.length);
//
//		   a = new int[i];
//		   System.out.println(a.length);
//		   
//		   int[] a = {12, 15, 11, 13, 9, 25};
//		   int[] a2 = {12, 15, 11, 13, 9, 25};
//		   int sum = 0;
//		   for (int i = 0; i <a.length; i++) {
//		            if (a[i] % 2== a2[i] % 5)  {
//		                     sum += i * i;
//		            }
//		   }
//		   System.out.println("sum = " + sum);
//		   System.out.println("-------------");
//		   
//		   
//		   char array_variable [] = new char[10];
//		   for (int i = 0; i < 10; ++i) {
//		            array_variable[i] = 'i';
//		            System.out.print(array_variable[i] + " ");
//		   }
//		   
//		   System.out.println("&&&&&&&&&&&&&&");
//		   int[] a = { 1, 4, 3, 6, 8, 2, 5 };
//
//		   int max=a[0];
//		   
//		   for(int i=0; i<a.length; i++) {
//			   
//			   if(a[i]>max) {
//				 max=a[i];
//				 
//			   }
//			   System.out.print(max+" "); 
//			   
//		   }
//		   System.out.println("==");
//		   System.out.println(max);
//		   
//	
//		   
//		   
//		   System.out.println("%%%%%%%%%%%%");
//		   
//		    int[] zip = new int[5];
//
//			zip[0] = 7;
//			zip[1] = 3;
//			zip[2] = 4;
//			zip[3] = 1;
//			zip[4] = 9;
//
//            System.out.println( zip[ 0+1 ] );
//            
//            
//            String str = "0123456789";
//            System.out.println(str.substring(4));
//            
//            String word ="abrakadabra";
//
//            String replace=word.replaceAll("[^aAeEiIoOuU]", " ");
//
//            System.out.println(replace);
//            System.out.println("===");
            
            
            
            
//            
            int [] arr= {4,9,6};
            int to=0;
            
            for(int p=0; p<=arr.length; p++) {
            	top+=arr[p];
            	System.out.println(to);	
            }
            
          
            
	}

}
