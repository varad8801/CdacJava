package constructor;

public class Car extends Vehicle{
	  int numDoors; 
	boolean automatic;
	
	Car(){
		super();
		numDoors=0;
		automatic=false;
	}

	public Car(int make, String model, int year, String color, int numDoors, boolean automatic) {
		super(make, model, year, color);
		this.numDoors = numDoors;
		this.automatic = automatic;
	}

	public Car(int make, String model, int year) {
		super(make, model, year);
		numDoors=0;
		automatic=false;
		// TODO Auto-generated constructor stub
	}
	
	
}
