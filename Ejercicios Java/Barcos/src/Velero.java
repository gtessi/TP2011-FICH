
public class Velero extends Barco {
	private int mastiles;
	
	public Velero(String mat, float es, String a, int mast) {
		super(mat, es, a);
		this.mastiles = mast;
	}

	public float modulo() {
		float total = 0;
		
		total = this.moduloNormal() + this.mastiles;
		
		return total;
	}
	
}
