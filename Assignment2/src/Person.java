
public class Person {
	private String Name;
	private Car car;
	
	
	


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Car car=new Car();
		car.setMake(9989);
		car.setModel("Volvo");
		car.setYear(1998);
		car.setMileage(22.6);
		car.setFuel_level(50);
		p1.setName("Goku");
		p1.setCar(car);
		System.out.println("Name: "+p1.getName());
		System.out.println("Car: "+p1.getCar());
		
	}

}
