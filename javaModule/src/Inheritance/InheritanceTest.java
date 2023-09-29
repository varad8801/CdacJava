package Inheritance;

class Vehicle{
	void Run() {
		System.out.println("Vehicle is running");
		
	}
}
class Car extends Vehicle{
	void CarRun() {
		System.out.println("Car is running");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.Run();
		car.CarRun();
	}

}
