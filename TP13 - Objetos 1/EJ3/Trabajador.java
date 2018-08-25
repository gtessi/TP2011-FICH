
public abstract class Trabajador {
	private String apellido;
	private String nombre;
	private int dni;
	private int direccion;
	
	public Trabajador(String n,String a, int d, int dir){
		apellido=a;
		nombre=n;
		dni=d;
		direccion=dir;
	}
	
	public abstract float calc_sueldo(Periodo oPeriodo);

	public String mostrar(){
		return apellido + " " + nombre + " " + dni;
	}
	
}
