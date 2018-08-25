
public class Pasajeros {
	private float anchoUtil;
	private float largo;
	
	public Pasajeros(float au, float l){
		this.anchoUtil = au;
		this.largo = l;
	}
	
	public int cantidadPasajeros() {
		float total = 0;
		
		if(this.anchoUtil <= 2.5)
			total = this.largo * 8;
		else
			total = this.largo * 10;
				
		return (int) (total);
	}

	public float pesoMaximo() {
		float total = this.cantidadPasajeros() * 80;
		
		return total;
	}
}
