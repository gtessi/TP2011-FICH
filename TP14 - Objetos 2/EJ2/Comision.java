import java.util.Collection;
import java.util.Vector;

public class Comision {

	private Collection<Alumno> cAlumnos;
	private String ID;
	private String fecInicAcad;

	//private Vector  inscripto;
	private Collection<Docente> ayudantes;
	private Docente titular;
	private Catedra myCatedra;

	private Vector  myExamen;
	
	public Comision(Catedra cat, String nom, String fec_ini, Docente oProfesor) {
		this.ID = nom;
		this.myCatedra = cat;
		this.fecInicAcad = fec_ini;
		this.titular = oProfesor;
		this.cAlumnos = new Vector<Alumno>();
		cat.agregarComision(this);
	}
	
	public void agregarAlumno(Alumno oAlumno){
		cAlumnos.add(oAlumno);
	}
	
	public void listarAlumnos() {
		String datos;
		System.out.println("Comision: " + this.ID);
		System.out.println("Fecha de inicio: " + this.fecInicAcad);
		System.out.println();
		
		for(Alumno oAlumno: cAlumnos) {
			datos = oAlumno.mostrar();
			System.out.println(datos);
		}
		
		System.out.println();
	}
	
	public void agregarProfesor() {
	}

}