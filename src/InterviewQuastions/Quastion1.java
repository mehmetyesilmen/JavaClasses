package InterviewQuastions;

public class Quastion1 {

	public static void main(String[] args) {
		
	//	1.Write a program to swap 2 numbers without a temporary variable?
    //	Swap 2 strings without a temporary variable?
		
		int x=10;
		int y=5;
		
		x=x+y;//x 15
		y=x-y;//y 10
		x=x-y;//x 5
		
		System.out.println("After swaping: "+" x= "+x+" , y="+y);
		
		String a = "Love";
		String b = "You";
		
		   System.out.println("Before swap: " + a + " " + b);
		   a = a + b; // love you
		   b = a.substring(0, a.length() - b.length());
		   a = a.substring(b.length());
		   System.out.println("After : " + a + " " + b);
		   System.out.println("========================");
		   
		   int k=20;
		   int l=30;
		   
		   k=l+k;//k=50
		   l=k-l;//l=20
		   k=k-l;//k=30
		   
		   System.out.println("Before swaping k=20,l=30 "+"After swaping k="+k+",l="+l );
		   

	}

}
