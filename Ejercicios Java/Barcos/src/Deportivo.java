
public class Deportivo extends Barco {
	private int potencia;

	public Deportivo(String mat, float es, String a, int pot) {
		super(mat, es, a);
		this.potencia = pot;	
	}
	
	public float modulo(){
		float total = 0;
		
		total = this.moduloNormal() + this.potencia;
		
		return total;
	}

}
