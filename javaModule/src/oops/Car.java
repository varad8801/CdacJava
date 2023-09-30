package oops;

import java.util.Scanner;

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
	 
	 
	
	  Car(int speed,int no_Wheels,String col){
	 System.out.println("I am in a constructor 2");
	 this.speed=speed; 
	 this.no_Wheels=no_Wheels;
	  this.col=col;
	  
	 }
	  
	  Car(int speed,int no_Wheels){
			 System.out.println("I am in a constructor 3");
			 this.speed=speed; 
			 this.no_Wheels=no_Wheels;
			  
			  
			 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int speed=sc.nextInt();
		  String color=sc.next();
		  int wheels=sc.nextInt();
		  Car a=new Car(speed, wheels);
		  a.show();
		  //a.show(speed, wheels, color);

		  
		  
		  
			/*
			 * Car alto=new Car(speed,wheels,color); alto.show(); Car car1=new
			 * Car(speed,wheels); car1.show();
			 */
		  
		  
		  

	      
		  
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
			/*
			 * alto.show(77,6,"Yellow"); Car mart=new Car(66,5,"Red");
			 */
			/*
			 * driver mama=new driver(); mama.setAge(26); mama.setName("Mama");
			 * System.out.println(mama.getName()); System.out.println(mama.getAge());
			 */
		
		 
		 
		
	
	}

}
