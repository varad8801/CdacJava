
public class Character {
	private String name;
	private int health;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", health=" + health + "]";
	}
	
}
