package replJava;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	
	  String str="y";
	  String str1="ey";
	  String str2="ife";
	 
	  if(str.endsWith("y")){
	    System.out.println("-ies");
	    
	  }else if(str1.endsWith("ey")){
	    System.out.println("-eys");
	    
	  }else if(str2.endsWith("ife")){
	    System.out.println("-ives");
	    
	  }else{
	    System.out.println("-s");
	  }
		


	}

}
