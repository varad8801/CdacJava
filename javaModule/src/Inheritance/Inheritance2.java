package Inheritance;

public class Inheritance2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer deer=new Deer();
		deer.show();
	//	deer.display();

	}

}
class Animals{
	void display() {
		System.out.println("Animal");
	}
	void show() {
		System.out.println("I am an Animal");
	}
	Animals(){
		System.out.println("constructor Animal");
	}
}
class Herbi extends Animals{
	void show() {
		super.show();
		System.out.println("I am a herbi Animal");
	}
	Herbi(){
		super();
		System.out.println("Constru herbi");
	}
}
class Carni extends Animals{
	void show() {
		System.out.println("I am a carni Animal");
	}
}
class Lion extends Carni{
	void show() {
		System.out.println("I am a Lion");
	}
}
class Deer extends Herbi{
	
	void show() {
		
		super.show();
		System.out.println("I am a Deer");
	}
}