
public class Empresa {
	private String nombre;
	private String razon_social;
	
	public Empresa(String nom, String rs) {
		nombre = nom;
		razon_social = rs;
	}
		
	public String mostrarNombre() {
		return "'" + this.nombre + "' - " + this.razon_social; 
	}	
}
