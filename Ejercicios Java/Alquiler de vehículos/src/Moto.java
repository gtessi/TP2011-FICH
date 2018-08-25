public class Moto extends Vehiculo {
	private float cilindrada;
	
	public Moto(int s, float c){
		super(s);
		this.cilindrada = c;
	}

	public int cantidadDePasajeros(){
		int cantidad = 1;
		
		if (cilindrada > 150){
			cantidad = 2;
		}
		
		return cantidad;
	}

	public float gastoCada100Km(){
		float gasto = 5 + (cilindrada / 200);
		return gasto;
	}

	public float velocidadMaxima(){
		float resultado = cilindrada / 5;
		return resultado;
	}
	
}
