
public class Caja {
	private float peso;
	private String contenido;
	
	public Caja(float p, String cont){
		this.peso = p;
		this.contenido = cont;
	}
	
	public float mostrarPeso(){
		return this.peso;
	}
	
	public String mostrarContenido(){
		String cadena = this.contenido + " - " + Float.toString(this.peso);
		
		return cadena;
	}
	
	public String tipo(){
		return this.contenido;
	}
	
}
