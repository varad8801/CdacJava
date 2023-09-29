package oops;

public class StudentDemo {

	int rollno;
	String Name;
	double fees;

	void display() {
	System.out.println("display1");
		System.out.println("Rollno " + rollno);
		System.out.println("name  " + Name);

		System.out.println("fees " + fees);
	}

	int showroll() {
		return rollno;
	}

	void display(int roll, String Name, double fee) {
		System.out.println("display2");
		System.out.println("Rollno " + roll);
		System.out.println("name  " + Name);
		System.out.println("fees " + fee);
	}
	
	void display(int roll, String Name) {
		System.out.println("display3");
		System.out.println("Rollno " + roll);
		System.out.println("name  " + Name);
	//	System.out.println("fees " + fee);
	}

	
	  StudentDemo(int roll, String Nam, double fee){
	  System.out.println("Constructor 2"); 
	  rollno=roll; 
	  Name=Nam;
	  fees=fee; 
	  }
	  
	  StudentDemo(int roll, String Nam){
		  System.out.println("Constructor 3"); 
		  rollno=roll; 
		  Name=Nam;
		  
		  }
	  
	  StudentDemo(){
		  System.out.println("I am in constructor 1");
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StudentDemo std=new StudentDemo(2,"Gohan",400); StudentDemo std2=new
		 * StudentDemo(1,"Goku",100);
		 */
		
		/*
		 * StudentDemo sai=new StudentDemo(); sai.Name="saikiran"; sai.rollno=43;
		 * sai.fees=68.9;
		 */
		
		/* sai.display(); */
		StudentDemo yash=new StudentDemo();
		StudentDemo sai = new StudentDemo(43,"Sai",400.6);
		StudentDemo aniket=new StudentDemo(45,"Aniket");
	
		sai.display();
		aniket.display();
		
		yash.display(77,"Yash");
		//System.out.println(ab);

	}

}
