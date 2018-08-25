
public abstract class Empleado {
	
	private String nombre;
	
	public Empleado(String nombre2) {
		nombre = nombre2;
	}
	
	public abstract float calcularSueldo();
	
	public String mostrarDescripcion() {
		return this.nombre.toUpperCase();
		
	}
	
	
}
