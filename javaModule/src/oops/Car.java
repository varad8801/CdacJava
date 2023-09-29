package oops;

public class Car {
	
	int speed;
	int no_Wheels;
	String col;
	void show() {
		System.out.println("show1");

		System.out.println(speed);
		System.out.println(no_Wheels);
		System.out.println(col);
	}
	void show(int speed,int no_Wheels,String col) {
		System.out.println("show2");
		System.out.println(speed);
		
		System.out.println(no_Wheels);
		System.out.println(col);
	}
	Car(){
		System.out.println("I am in a constructor 1 ");
	}
	Car(int sped,int n_w,String cl){
		System.out.println("I am in a constructor 2");
		speed=sped;
		no_Wheels=n_w;
		col=cl;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Car alto=new Car(); alto.show(77,6,"Yellow"); Car mart=new Car(66,5,"Red");
		 */
		driver mama=new driver();
		mama.setAge(26);
		mama.setName("Mama");
		System.out.println(mama.getName());
		System.out.println(mama.getAge());
		
		 
		 
		
	
	}

}
