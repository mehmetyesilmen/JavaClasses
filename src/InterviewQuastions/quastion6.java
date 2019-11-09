package InterviewQuastions;

public class quastion6 {

	public static void main(String[] args) {
		
// first way for reverse a string		
		String str="Turkey";
		StringBuffer a=new StringBuffer(str);
		System.out.println(a.reverse());
		
		
		
// second way for reverse a string
		String str1="babab";
		int  len=str1.length();
		
		String org="";
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+str1.charAt(i);
			
			}
		if(org.equals(rev)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
		System.out.println("===========");
		
		System.out.println(len);
		System.out.println("===========");
		
		String original="kayak";
		String reversed="";
		
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
			
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("Given string is palindrome");
			
		}else {
			System.out.println("Given string is not palindrome");
		}
	}

}
