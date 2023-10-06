package inheritanceQ1;

public class BlueWhale implements Mammals, MarineAnimals {
 public void display() {
		System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
		
}
 public static void main(String[] args) {
	Mammals mam=new BlueWhale();
	
}
}
