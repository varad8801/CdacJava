
public class Wizard extends Character{
	private  String unq_abl;

	public  String getUnq_abl() {
		return unq_abl;
	}

	public  void setUnq_abl(String unq_abl) {
		this.unq_abl = unq_abl;
	}

	@Override
	public String toString() {
		return "Wizard [getName()=" + getName() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
