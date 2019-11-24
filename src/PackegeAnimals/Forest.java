package PackegeAnimals;
   
public class Forest {
	
	static int numberOfWolves;
	static int numberOfFoxes;
	static int numberOfBears;
	static int numberOfAnimals;
	
	//Create four classes: Forest, Wolf, Fox, Bear
    //Class wolf has: color, age, numberOfWolves
    //Class fox has: color, speed, numberOfFoxes
    //Class bear has: type, weight, numberOfBears
    
    //Forest has main method
    //Create different objects/instances of different classes
    //At the end, print the total for each animal.

	public static void main(String[] args) {
		
		Forest animal=new Forest();
		
		
        Wolf w1=new Wolf();
		
		w1.color="black";
		w1.age=5;
		w1.numberOfWolves++;
		w1.info();
		animal.numberOfAnimals++;
		
		 
		
		Wolf w2=new Wolf();
		
		w2.color="brown";
		w2.age=4;
//		w2.numberOfWolves++;
		w2.info();
		animal.numberOfAnimals++;
		
        FOX f1=new FOX();
		
		f1.color="red";
		f1.speed=50;
		f1.numberOfFoxes++;
		f1.info();
		animal.numberOfAnimals++;
		
		
        FOX f2=new FOX();
		
		f2.color="green";
		f2.speed=60;
//		f2.numberOfFoxes++;
		f2.info();
		animal.numberOfAnimals++;
        
		
        Bear b1=new Bear();
		
		b1.type="large";
		b1.weight=100;
		b1.numberOfBears++;
		b1.info();
		animal.numberOfAnimals++;
		
		
		Bear b2=new Bear();
		
		b2.type="small";
		b2.weight=80;
//		b2.numberOfBears++;
		b2.info();
		animal.numberOfAnimals++;
		
		
		System.out.println("In the forest we have totally we have "+animal.numberOfAnimals++);
		

	}

}
