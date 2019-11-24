package InterviewQuastions;

public class quastion4 {
	
	String str(String reversed) {
		
		
		return "mehmet";
	}
	
	public boolean str2(String org) {
		String org1="mahham";
		String rev="";
		boolean pol=true;
		
		for(int i=org1.length()-1; i>=0; i--) {
			rev=rev+org1.charAt(i);
			if(org.equals(rev)) {
				pol=true;
			}else {
				pol=false;
			}
		}	

		return pol;
	}
	
	public static void main(String[] args) {
		
		quastion4 obj=new quastion4();
		
		String str1=obj.str("mehmet");		
		System.out.println(str1);
		
		boolean b=obj.str2("mahham");
		System.out.println(b);
		
		
		
	

	}

}
