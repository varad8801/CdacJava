package constructor;

public class Vehicle {
	private int make;
	private String model;
	private int year;
	private String color;
	
	Vehicle(){
		make=0;
		model="";
		year=0;
		color="";
	}


	
	



	







	public Vehicle(int make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}















	public Vehicle(int make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		color="Unknown";
	}















	
	
}
