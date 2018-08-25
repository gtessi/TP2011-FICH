import java.util.Calendar;


public class Deportivo extends Barco{
	private int potencia;
	
	public Deportivo(String mat, float esl, Calendar af, int pot) {
		super(mat, esl, af);
		this.potencia = pot;
	}
	
	public float modulo() {
		return this.calcularModuloNormal() + this.potencia;
	}
}
