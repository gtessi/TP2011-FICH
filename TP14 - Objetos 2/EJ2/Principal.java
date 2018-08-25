
public class Principal {

	public static void main(String[] args) {
		Universidad oUniversidad = new Universidad(111, "UNL");
		
		Carrera oCarreraII = new Carrera(21,"Ing. Informatica");
		Carrera oCarreraIA = new Carrera(22,"Ing. Ambiental");
		
		oUniversidad.agregarCarrera(oCarreraII);
		oUniversidad.agregarCarrera(oCarreraIA);
		
		Catedra oCatedraTP = new Catedra(211,"TecProg");
		Catedra oCatedraCalc = new Catedra(211,"Calculo");
		
		oCarreraII.agregarCatedra(oCatedraTP);
		oCarreraIA.agregarCatedra(oCatedraCalc);
		
		Docente oDocente1 = new Docente();
		Docente oDocente2 = new Docente();
		
		Comision oComisionA = new Comision(oCatedraTP, "A", "03-06-2011", oDocente1);
		Comision oComisionB = new Comision(oCatedraCalc, "B", "03-06-2011", oDocente2);
		
		Persona oPers1 = new Persona("Juan", "Perez", 30000000, "Santa Fe");
		Persona oPers2 = new Persona("Roberto", "Sanchez", 25000000, "Parana");
		Persona oPers3 = new Persona("Matias", "Lopez", 33333333, "San Juan");
		Persona oPers4 = new Persona("Lorena", "Martinez", 35021923, "Buenos Aires");
		
		Alumno oAlum1 = new Alumno(oPers1, "03-03-2010");
		Alumno oAlum2 = new Alumno(oPers2, "04-03-2009");
		Alumno oAlum3 = new Alumno(oPers3, "04-03-2009");
		Alumno oAlum4 = new Alumno(oPers4, "15-03-2008");
		
		oComisionA.agregarAlumno(oAlum1);
		oComisionA.agregarAlumno(oAlum2);
		oComisionB.agregarAlumno(oAlum3);
		oComisionB.agregarAlumno(oAlum4);	
		
		
		oUniversidad.listar(oCatedraCalc);
		
	}
}


