package InterviewQuastions;

public class quastion5 {

	public static void main(String[] args) {
		
//reverse string char
//first way
		String s="Selenium";
		
		int length=s.length();
		String rev="";
		
		for(int i=length-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		System.out.println("======================");
		
		
// reverse sentence word by word
// second way		
		String name="I am going to school";
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		
		System.out.println("======================");
		
		String ab="Programing";
		StringBuffer cd=new StringBuffer(ab);
		System.out.println(cd.reverse());
		
		System.out.println("======================");
		
		String str="hello bye";
		
		int a=str.length();
		String reverse="";
		
		for(int i=a-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		System.out.println("======================");
		
		String reversed ="";
		String [] k=name.split("\\s");
		for(int j=k.length-1; j>=0; j--) {
			reversed=reversed + k[j]+" ";
			
		}
		System.out.println(reversed);
		System.out.println("======================");
		
		String mehmet ="Today is java class";
		char [] ch=mehmet.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
			
		}
		
        String km="I am going to school";
		
		String rever="";
		
		String [] arr=km.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			rever=rever+arr[i]+" ";
		}
		System.out.print(rever);
	}
	
}
