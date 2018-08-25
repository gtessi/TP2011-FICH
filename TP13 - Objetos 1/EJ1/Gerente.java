
public class Gerente extends Empleado {

	public String gerencia;
	
	public Gerente(String gerencia, String nombre) {
		super(nombre);
		this.gerencia = gerencia;
		
	}
	
	public float calcularSueldo() {
		return 1000;
	}
	
	public String mostrarDescripcion() {
		
		return super.mostrarDescripcion() + " - " + this.gerencia;
	}
	
}
