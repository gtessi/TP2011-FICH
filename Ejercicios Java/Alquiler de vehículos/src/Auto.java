public class Auto extends Vehiculo {
	private float vel_max;
	private int cant_pas;
	
	public Auto(int s, float v_m, int c_p){
		super(s);
		this.vel_max = v_m;
		this.cant_pas = c_p;
	}
	
	public int cantidadDePasajeros(){
		return cant_pas;
	}
	
	public float gastoCada100Km(){
		float gasto = 20 + (cant_pas * 10);
		return gasto;
	}

	public float velocidadMaxima(){
		return vel_max;
	}
	
}
