package reviwePackege2;

public class classrepl {
	
	
	public static void main(String[] args) {
		
		
		
		String str2="hello";
		String str3="hello";
		
		
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		
		
		String str=new String("hello");
		String str1=new String("hello");
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		String str5="Bugun havanin cok soguk olmasindan dolayi okula gidemedim";
		String [] array1=str5.split(" ");
		
        
		
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		
		

		
	}

}
