
public abstract class Barco {
	private String matricula;
	private float eslora;
	private String a�o;
	
	public Barco(String mat, float es, String a){
		this.matricula = mat;
		this.eslora = es;
		this.a�o = a;
	}
	
	public abstract float modulo();
	
	public String mostrar(){
		String cadena = "";
		
		cadena = this.matricula + " - " + this.a�o;
		
		return cadena;
	}
	
	public float moduloNormal(){
		float total = 0;
		
		total = this.eslora * 10;
		
		return total;
	}
}
