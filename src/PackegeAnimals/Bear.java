package PackegeAnimals;

public class Bear {
	
	String type;
	int weight; 
	static int numberOfBears;
	
	void info() {
		System.out.println("The type is "+type+ " the weight "+weight+" and the total number is "+numberOfBears++ );
	}
	

	public static void main(String[] args) {
		
		Bear b1=new Bear();
		
		b1.type="large";
		b1.weight=100;
		numberOfBears++;
		b1.info();
		
		
		Bear b2=new Bear();
		
		b2.type="small";
		b2.weight=80;
//		b2.numberOfBears++;
		b2.info();
		
		

	}

}
