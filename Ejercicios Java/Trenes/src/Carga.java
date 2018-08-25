
public class Carga {
	private float cargaMaxima;
	
	public Carga(float cm){
		this.cargaMaxima = cm;
	}
		
	public float pesoMaximo() {
		float total = this.cargaMaxima + 160;
		
		return total;
	}
}
