package inheritanceQ2;

public class Main {

	public static void main(String[] args) {
        Fruit basket = new Fruit();
        Apples apples = new Apples();
        Mangoes mangoes = new Mangoes();
        
        apples.setApples(40);
        mangoes.setMangoes(40);
       
    

        System.out.println("Number of apples: " + apples.getApples());
        System.out.println("Number of mangoes: " + mangoes.getMangoes());
       System.out.println("Total number of fruits: " +  basket.getTotalFruits(apples.getApples(), mangoes.getMangoes()));
    }

}
