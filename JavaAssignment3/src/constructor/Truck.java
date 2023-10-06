package constructor;

public class Truck extends Vehicle {
	double payloadCapacity;
	double towingCapacity ;
	
	public Truck() {
		super();
		payloadCapacity=0.0;
		towingCapacity=0.0;
	}
	public Truck(int make, String model, int year, String color, double payloadCapacity, double towingCapacity) {
		super(make, model, year, color);
		this.payloadCapacity = payloadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public Truck(int make, String model, int year) {
		super(make, model, year);
		payloadCapacity=0.0;
		towingCapacity=0.0;
		// TODO Auto-generated constructor stub
	}
}
