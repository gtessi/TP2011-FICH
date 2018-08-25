import java.util.Vector;


public class Amarra {
	private String posicion;
	private Vector<Alquiler> cAlquileres;
	
	public Amarra(String pos){
		this.posicion = pos;
		this.cAlquileres = new Vector<Alquiler>();
	}
	
	public String mostrar(){
		String cadena = "";
		
		cadena = "Amarra: " + this.posicion;
		
		return cadena;
	}
}
