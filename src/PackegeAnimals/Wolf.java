package PackegeAnimals;

public class Wolf {
	
	String color;
	int age; 
	static int numberOfWolves;
	
	void info() {
		System.out.println("The color is "+color+ " the age "+age+" and the total number is "+numberOfWolves++ );
	}

	public static void main(String[] args) {
		
		Wolf w1=new Wolf();
		
		w1.color="black";
		w1.age=5;
		w1.numberOfWolves++;
		w1.info();
		
		Wolf w2=new Wolf();
		
		w2.color="brown";
		w2.age=4;
		
		w2.info();
		
		
       
		

	}

}
