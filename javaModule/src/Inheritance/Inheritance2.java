package Inheritance;

public class Inheritance2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l1=new Lion();
		l1.show();
		Animals l2=new Lion();
		l2.show();
		Deer d1=new Deer();
		d1.show();

	}

}
class Animals{
	void show() {
		System.out.println("I am an Animal");
	}
}
class Herbi extends Animals{
	void show() {
		System.out.println("I am a herbi Animal");
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