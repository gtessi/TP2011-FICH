import java.util.Iterator;
import java.util.Vector;


public class Carrera {
	private Vector<Alumno> cAlumnos;
	/**
	* Este método cuenta la cantidad de egresados de la carrera
	* y muestra el promedio de cada uno de ellos (Sin desaprobados)
	*/
	public short listar_egresados() {
		
		short cant_egresados = 0;
		
		// Recorro todos los alumnos de la CARRERA
		Iterator<Alumno> iAlumnos = cAlumnos.iterator();
		
		while(iAlumnos.hasNext()) {
		
			Alumno oAlumno = iAlumnos.next();
				
			if (oAlumno.esEgresado()) {
				cant_egresados++;
				
				System.out.println(oAlumno.mostrarDatos());
			} // Fin if
		} // Fin while
		return cant_egresados;
	}
}
