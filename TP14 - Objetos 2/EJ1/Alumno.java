import java.util.Collection;
import java.util.Date;


public class Alumno {
	String nombre;
	Date fecha_ingreso;
	Date fecha_egreso;
	
	private Collection<Examen> cExamenes;
	
	public boolean esEgresado() {
		
		boolean valor;
		
		if(this.fecha_egreso != null) {			
			valor = true;
		}
		else {
			valor = false;
		}
		
		return valor;
	}
	
	public float calcPromedio() {
		
		// Recorro todas las NOTAS de los ALUMNOS
		float acumula_notas = 0;
		int cant_examenes_aprobados = 0;
		float nota;
		
		for(Examen oExamen : cExamenes) {
			
			nota = oExamen.mostrarNota();
			
			if (nota >= 6) {
				acumula_notas += nota;
				cant_examenes_aprobados++;
			}
		} // Fin for
		
		float promedio = acumula_notas/cant_examenes_aprobados;
		
		return promedio;
	}
	
	public String mostrarDatos() {
		return ("Egresado " + this.nombre + " - Promedio:" + this.calcPromedio());
	}
	
}
