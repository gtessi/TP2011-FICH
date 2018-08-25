import java.util.Collection;
import java.util.Vector;

public class Principal {

	Collection<Empleado> cEmpleados;
	
	public Principal() {
		this.cEmpleados = new Vector<Empleado>();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal oPrincipal = new Principal();
		
		Operario oOperario = new Operario("Juan Sanchez");
		Gerente oGerente = new Gerente("Contable", "Jose Perez");
		
		oPrincipal.cEmpleados.add(oOperario);
		oPrincipal.cEmpleados.add(oGerente);
		
		oPrincipal.mostrarDatos();

	}
	
	public void mostrarDatos() {
		for(Empleado oEmpleado: this.cEmpleados) {
			System.out.println(oEmpleado.mostrarDescripcion() + " - " + oEmpleado.calcularSueldo());
		}
	}

}
