
public class Bidon {
	private float densidad, capacidad;
	private String contenido;
	
	public Bidon(float dens, float cap, String cont){
		this.densidad = dens;
		this.capacidad = cap;
		this.contenido = cont;
	}
	
	public float mostrarPeso(){
		float peso = densidad * capacidad;
		return peso;
	}
	
	public String mostrarContenido(){
		String cadena = "Contenido: " + contenido +
						" - Capacidad: " + Float.toString(capacidad) +
						" - Peso: " + Float.toString(this.mostrarPeso());
		return cadena;
	}
	
	public String tipo(){
		return this.contenido;
	}
	
}
