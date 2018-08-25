public class Empleado {
	private String nombre;
	private char sexo;
	
	public Empleado(String nom, char s){
		this.nombre = nom;
		this.sexo = s;
	}
	
	public String mostrarDatos(){
		String datos = "Nombre: " + this.nombre + " - Sexo: " + this.sexo;
		return datos;
	}
}
