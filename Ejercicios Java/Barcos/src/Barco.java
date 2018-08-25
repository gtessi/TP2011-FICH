
public abstract class Barco {
	private String matricula;
	private float eslora;
	private String año;
	
	public Barco(String mat, float es, String a){
		this.matricula = mat;
		this.eslora = es;
		this.año = a;
	}
	
	public abstract float modulo();
	
	public String mostrar(){
		String cadena = "";
		
		cadena = this.matricula + " - " + this.año;
		
		return cadena;
	}
	
	public float moduloNormal(){
		float total = 0;
		
		total = this.eslora * 10;
		
		return total;
	}
}
