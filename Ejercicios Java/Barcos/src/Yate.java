
public class Yate extends Barco {
	private int potencia;
	private int camarotes;
	
	public Yate(String mat, float es, String a, int pot, int cam) {
		super(mat, es, a);
		this.potencia = pot;
		this.camarotes = cam;
	}
	
	public float modulo() {
		float total = 0;
		
		total = this.moduloNormal() + this.potencia + this.camarotes;
		
		return total;
	}	
	

}
