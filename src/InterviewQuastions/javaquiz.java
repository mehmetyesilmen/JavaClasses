package InterviewQuastions;

public class javaquiz {

	public static void main(String[] args) {
		int nums[] = { 12, 15, 16, 17, 19 };

//		   for (int i = nums.length-1; i >0; i--) {
//
//		      System.out.print(nums[i] +" ");
//
//		    }
//         System.out.println("========");
		   
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
		   
		   System.out.println("&&&&&&&&&&&&&&");
		   int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		   int what = array[0];

		   for (int index = 0; index < array.length; index++) {

		          if (array[index] > what) {

		                     what = array[index];

		           }

		   }

		   System.out.println(what);
		   
//		   System.out.println("%%%%%%%%%%%%");
//		   
		    int[] zip = new int[5];

			zip[0] = 7;
			zip[1] = 3;
			zip[2] = 4;
			zip[3] = 1;
			zip[4] = 9;

            System.out.println( zip[ 0+1 ] );
            
            
            String str = "0123456789";
            System.out.println(str.substring(4));
            
            String word ="abrakadabra";

            String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

            System.out.println(replace);
	}

}
