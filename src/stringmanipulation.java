
public class stringmanipulation {

	public static void main(String[] args) {
		
		
		String str=" heLLo";
		String str1="herLOwordNoasiolsin";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		if(str1.startsWith("herL")){
			System.out.println("str1 starts with her ");
		}
		
		
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("str is equales to str1");
		}else {
			System.out.println("not equales");
		}
		System.out.println(str.concat(str));
		System.out.println(str.concat(str1));
		System.out.println(str1.charAt(5));
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.replace('o', 'K'));
		System.out.println(str1.substring(3,6));
		System.out.println(str.trim());
		String name="Timmy";
	    System.out.println(name.indexOf('y'));

	}

}
