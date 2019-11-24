package reviwePackege2;

public class IQDemo {

	public static void main(String[] args) {
		//IQ-1
		int x=10;
		int y=15;
		
		System.out.println("swaptan once");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x=x+y; // x=25
		y=x-y; // y=10
		x=x-y; // x=15
		
		System.out.println("swaptan sonra");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		String a="good";
		String b="morning";
		
		System.out.println("swaptan once "+a+" "+b);
		System.out.println(a);
		System.out.println(b);
		a=a+b; // a = good morning 
		b=a.substring(0, a.length()-b.length()); //b = morning
		a=a.substring(b.length()); // a = good
		System.out.println("swaptan sonra "+a+" "+b);
		System.out.println(a);
		System.out.println(b);
		
		//IQ-3
		
		String str="njgeu94utjer 36ryuur95&*#W$E@%hgnyrd9";
		int str1=str.length();
		System.out.println(str1);
		str=str.replaceAll("[ˆA-z]", "");
		System.out.println(str);
		
		//IQ-4
		
		String s="Bu gun okula gec kaldim";
//      System.out.println(s.substring(7, 12));
		String [] words =s.split(" ");
		System.out.println(words.length);
		
		// IQ =-5
		
		String k="I am going to school";
		
		String reverse="";
		
		String [] arr=k.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			reverse=reverse+arr[i]+" ";
		}
		System.out.print(reverse);
		
		System.out.println();
		
		//IQ-6
		
	    String m="Mehem";
	    
	    String rear="";
	    
	    boolean isPol=true;
	    
	    for(int i=m.length()-1; i>=0; i--) {
	    	rear=rear+m.charAt(i);
	    	if(m.equals(rear)) {
	    		isPol=true;
	    	}else {
	    		isPol=false;
	    	}
	    }
	    System.out.println(isPol);
	    
	    
		//IQ-7
		
		int num=12;
		
		boolean isPrime=true;
		
		
			for(int i=2; i<=num; i++) {
				if(num%2==0) {
					isPrime=false;
				}
			}
			System.out.println(isPrime);
			
			
		//IQ-8
			
			int p=0;
			int r=1;
			int q;
			
			for(int i=0; i<=10; i++) {
				q=p+r;
				p=r;
				r=q;
			}
		System.out.println(p);
	
	}

}
