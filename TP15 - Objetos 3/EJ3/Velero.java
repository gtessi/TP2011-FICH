import java.util.Calendar;


public class Velero extends Barco {
	private int mastiles;
	
	public Velero(String mat, float esl, Calendar af, int mast) {
		super(mat, esl, af);
		this.mastiles = mast;
	}
	
	public float modulo() {
		return this.calcularModuloNormal() + this.mastiles;
	}
}
