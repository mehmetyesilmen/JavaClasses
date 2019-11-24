package com.class24;

public class TaskConstructer {
	
	
	
	public TaskConstructer(){
		System.out.println("I am public Cocructer");
		
	}
	
    protected TaskConstructer(String str){
    	System.out.println("I am protectedc Cocructer");
		
	}
    
    TaskConstructer(int num){
    	System.out.println("I am default Cocructer");
		
	}
   
    private TaskConstructer(int num,int num1){
    	System.out.println("I am private Cocructer");
		
	}
    

	public static void main(String[] args) {
		
		TaskConstructer obj1=new TaskConstructer();
		TaskConstructer obj2=new TaskConstructer("mehmet");
		TaskConstructer obj3=new TaskConstructer(4);
		TaskConstructer obj4=new TaskConstructer(4,5);
		
		
		

	}

}
