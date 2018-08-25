
public class Cliente {
	private String nombre;
	private String dni;
	
	public Cliente(String nom, String doc){
		this.nombre = nom;
		this.dni = doc;
	}
	
	public String mostrarDatos(){
		String cadena = "";
		
		cadena = this.nombre + " - " + this.dni;
		
		return cadena;
	}
}
