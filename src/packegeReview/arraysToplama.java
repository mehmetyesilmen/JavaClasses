package packegeReview;

public class arraysToplama {

	public static void main(String[] args) {
		
		
		int [] arr= {2,4,6,8};
		
		int car=1;
		
		for(int i=0; i<arr.length; i++) {
			
			car*=arr[i];
			System.out.println(car);
		}
		
        int [] ar= {2,4,6,8};
		
		int top=0;
		
		for(int i=0; i<arr.length; i++) {
			
			top+=arr[i];
			System.out.println(top);
			
		}
		
        int [] a= {2,4,6,8};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
				
				}
			
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		int [][] array= {{1,2,3},
				         {4,0,6},
				         {7,11,9},
		                 };
		
		int sum=array[0][0];
		int col=0;
		int row=0;
		int ma =0;
		int mi =1;
		
		
		for(int k=0; k<array.length; k++) {
		    for(int j=0; j<array.length; j++) {
		    	
				if(array[k][j]>ma) {
					ma=array[k][j];
				}
				
				if(array[k][j]<mi) {
					mi=array[k][j];
				}
				sum+=array[k][j];
			}
			
		}
		System.out.println(sum);
		System.out.println(ma);
		System.out.println(mi);

	}

}
