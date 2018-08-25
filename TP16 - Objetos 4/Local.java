import java.util.Collection;
import java.util.Vector;


public class Local {
	private String nombre;
	private float sup;
	private String ubicacion;
	
	private Comida oComida;
	private Ropa oRopa;
	private Libreria oLibreria;
	
	private Collection<Empleado> cEmpleados;
	
	public Local(String nom, float sup, String ubicacion){
		this.nombre = nom;
		this.sup = sup;
		this.ubicacion = ubicacion;
		this.cEmpleados = new Vector<Empleado>();		
	}
	
	public void asignarComida(Comida oCom){
		this.oComida = oCom;
	}
	
	public void asignarRopa(Ropa oRop){
		this.oRopa = oRop;
	}
	
	public void asignarLibreria(Libreria oLib){
		this.oLibreria = oLib;
	}
	
	public void agregarEmpleado(Empleado oEmp) {
		this.cEmpleados.add(oEmp);
	}
	
	public float mostrarSuperficie() {
		return this.sup;
	}

	public void mostrarBar(int piso) {
		if(this.oComida != null) {
			if(this.oComida.esBar()) {
				System.out.println("Piso " + piso + " - Ubicacion: " + oComida.mostrarBar() + " - Nombre: " + this.nombre + " - Superficie: " + this.sup);
			}
		}		
	}

	public void mostrarCategoria(int piso) {
		String cadena = "";
		if(this.oComida != null) {
			cadena+="Comida - ";
		}
		if(this.oRopa != null) {
			cadena+="Ropa - ";
		}
		if(this.oLibreria != null) {
			cadena+="Libreria";
		}
		System.out.println("Piso " + piso + " - Ubicacion: " + oComida.mostrarBar() + " - Nombre: " + this.nombre + " - Superficie: " + this.sup + " " + cadena);
}
