
public class Cliente {
	private String nombre;
	private String razon_social;
	private String cuit;
	
	public Cliente(String nom, String rs, String c) {
		nombre = nom;
		razon_social = rs;
		cuit = c;
	}
	
	public String mostrarNombre() {
		return this.nombre + " - " + this.razon_social + " - " + this.cuit; 
	}	
}
