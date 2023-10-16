
public class Main {
	public static void main(String[] args) {
		Knight k1=new Knight();
		k1.setName("Jaime Lannister");
		k1.setUnq_abl(" best swordsmen ");
		k1.setHealth(100);
		Archer a1=new Archer();
		
		a1.setName("Arya Stark");
		a1.setUnq_abl(" Aim ");
		a1.setHealth(80);
		Wizard w1=new Wizard();
		w1.setName("Melisandre");
		w1.setUnq_abl("the ability to see visions in the flames");
		w1.setHealth(1000);
		System.out.println(k1.toString());
		System.out.println(a1.toString());
		System.out.println(w1.toString());
	}
}
