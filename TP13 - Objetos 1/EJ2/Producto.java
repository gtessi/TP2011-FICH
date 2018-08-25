
public class Producto {
	private String nombre;
	private float precio;
	
	public Producto(String nom, float prec) {
		nombre = nom;
		precio = prec;		
	}
	
	public float mostrarPrecio() {
		return this.precio;
	}
	
	public String mostrarNombre() {
		return this.nombre.toUpperCase();
	}
}
