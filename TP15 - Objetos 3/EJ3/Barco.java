import java.util.Calendar;


public abstract class Barco {
	private String matricula;
	private float eslora;
	private Calendar anio_fab;
	
	public Barco(String mat, float esl, Calendar af) {
		this.matricula = mat;
		this.eslora = esl;
		this.anio_fab = af;
	}
	
	public abstract float modulo();
	
	public String mostrar() {
		return "Matricula: " + this.matricula + " - Eslora: " + this.eslora;
	}
	
	public float calcularModuloNormal() {
		return this.eslora * 10;
	}
}
