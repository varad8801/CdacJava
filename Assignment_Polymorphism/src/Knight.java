
public class Knight extends Character{
	private static  String unq_abl;

	public  String getUnq_abl() {
		return unq_abl;
	}

	public  void setUnq_abl(String unq_abl) {
		Knight.unq_abl = unq_abl;
	}

	@Override
	public String toString() {
		return "Knight [Unq_abl=" + getUnq_abl() + ", Name=" + getName() + ", Health=" + getHealth()
				 +"]";
	}
	

	
}
