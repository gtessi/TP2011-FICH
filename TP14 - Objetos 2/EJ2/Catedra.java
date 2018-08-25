import java.util.Collection;
import java.util.Vector;

public class Catedra {

	private Collection<Comision> cComisiones;
	private String nombre;
	private Integer ID;

	public Catedra(Integer Id, String nom) {
		this.ID = Id;
		this.nombre = nom;
		this.cComisiones = new Vector<Comision>();
	}
	
	public void agregarComision(Comision oComision){
		cComisiones.add(oComision);
	}
	
	public void listarComisiones() {
		System.out.println("Catedra: " + this.nombre);
		System.out.println();

		for(Comision oComision: cComisiones) {
			oComision.listarAlumnos();			
		}
		
		System.out.println();
	}
}
