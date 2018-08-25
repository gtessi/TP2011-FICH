import java.util.Vector;


public class Local {
	private String nombre;
	private String ubicacion;
	private float superficie;
	
	private Vector<Empleado> cEmpleados;
	
	private Tienda oTienda;
	private Comida oComida;
	private Libreria oLibreria;
		
	public Local(String nom, String ubi, float sup){
		this.nombre = nom;
		this.ubicacion = ubi;
		this.superficie = sup;
		this.cEmpleados = new Vector<Empleado>();
	}
	
	public void asignarTienda(Tienda oTie){
		this.oTienda = oTie;
	}
		
	public void asignarComida(Comida oCom){
		this.oComida = oCom;
	}
	
	public void asignarLibreria(Libreria oLib){
		this.oLibreria = oLib;
	}
	
	public float mostrarSuperficie(){
		return this.superficie;
	}
	
	public void agregarEmpleado(Empleado oEmp){
		this.cEmpleados.add(oEmp);
	}
}
