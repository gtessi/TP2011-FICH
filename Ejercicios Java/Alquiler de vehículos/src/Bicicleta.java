public class Bicicleta extends Vehiculo {
	private float rodado;
	
	public Bicicleta(int s, float r){
		super(s);
		this.rodado = r;
	}

	public int cantidadDePasajeros(){
		return 1;
	}

	public float gastoCada100Km(){
		return 1;
	}

	public float velocidadMaxima(){
		float resultado = (float) (rodado * 1.2);
		return resultado;
	}
	
}
