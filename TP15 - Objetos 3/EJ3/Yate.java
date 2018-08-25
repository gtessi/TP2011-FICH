import java.util.Calendar;




public class Yate extends Barco{
	private int potencia;
	private int camarotes;
	
	
	public Yate(String mat, float esl, Calendar af, int pot, int cam) {
		super(mat, esl, af);
		this.potencia = pot;
		this.camarotes = cam;
	}
	
	public float modulo() {
		return this.calcularModuloNormal() + this.potencia + this.camarotes;
	}
}
