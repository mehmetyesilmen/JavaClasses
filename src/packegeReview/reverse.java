package packegeReview;

public class reverse {

	public static void main(String[] args) {
		
		
		String str="Today we do not have java class";
		
		int s=str.length();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
				rev=rev+str.charAt(i);
				
		}
		
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.toString());
		System.out.println(str.replaceAll(" ", "||"));
		System.out.println(str.replace('a', 'i'));
		System.out.println(str.startsWith("Today"));
		System.out.println(str.endsWith("class"));
		System.out.println(str.equals("baba"));
		System.out.println(str.concat(" baba"));
		System.out.println(str.indexOf("w"));
		System.out.println(str.substring(16, 20));
		System.out.println(str.substring(12));
		System.out.println(str.charAt(10));
		System.out.println(s);
		System.out.println(rev);
	}

}
