package PackegeAnimals;

public class FOX {
	
	String color; 
	int speed; 
	static int numberOfFoxes;
	
	void info() {
		System.out.println("The color is "+color+ " the speed "+speed+" and the total number is "+numberOfFoxes++ );
	}

	public static void main(String[] args) {
		
		FOX f1=new FOX();
		
		f1.color="red";
		f1.speed=50;
		f1.numberOfFoxes++;
		f1.info();
		
		
        FOX f2=new FOX();
		
		f2.color="green";
		f2.speed=60;
//		f2.numberOfFoxes++;
		f2.info();
		

	}

}
