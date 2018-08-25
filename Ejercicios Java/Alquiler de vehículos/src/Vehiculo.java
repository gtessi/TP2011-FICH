public abstract class Vehiculo {
	private int serie;
	
	public Vehiculo(int s){
		this.serie = s;
	}
	
	public abstract int cantidadDePasajeros();
	public abstract float gastoCada100Km();
	public abstract float velocidadMaxima();
	
	public String mostrarSerie(){
		return Integer.toString(serie);
	}
}
