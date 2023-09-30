package constructor;

public class Car extends Vehicle{
	  int numDoors; 
	boolean automatic;
	
	

	

	public Car() {
	
		super();
		System.out.println("const1");
		numDoors=0;
		automatic=false;
	}

	

	public Car(int make, String model, int year, String color, int numDoors, boolean automatic) {
		super(make, model, year, color);
		System.out.println("const2");
		this.numDoors = numDoors;
		this.automatic = automatic;
	}



	public Car(int make, String model, int year) {
		super(make, model, year);
		System.out.println("const3");
		numDoors=0;
		automatic=false;
		// TODO Auto-generated constructor stub
	}



	
	
	
}
