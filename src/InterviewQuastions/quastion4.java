package InterviewQuastions;

public class quastion4 {

	public static void main(String[] args) {
		
		
//		4.How to find out the part of the string from a string? 
//		What is substring? Find number of words in string?
		
		String str= "I am going to school";
		
		System.out.println(str.substring(2,10));
		
		//Step 1-split based on the space -->arrayof the string
		
		//Step 2-find the length of an array
		
		
		String [] word=str.split(" ");
		
		System.out.println(word.length);
		
	

	}

}
