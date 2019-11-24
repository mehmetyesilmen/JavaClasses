package com.class22;

public class LocalVariables {

	void sayName() {
		String myName="John";
		System.out.println(myName);	
		
	}
	
	String createEmail(String name,String lastName,String Email) {
		String userEmail=name+lastName+"@"+Email+".com";
		return userEmail;
	}
	
	
	
	public static void main(String[] args) {
		
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		System.out.println("_______________");
		String userEmail=obj.createEmail("John", "Smith", "gmail");
		System.out.println(userEmail);

	}
	
	

}
