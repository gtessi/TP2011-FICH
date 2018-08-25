import java.util.Vector;

public class Alumno {

  private Persona oPersona;
  private String fecha_ingreso;
  //private Date fecha_egreso;

  private Persona myPersona;
  private Vector  a1;
  private Vector  myExamen;

  public Alumno(Persona oPer, String fec_ing) {
		this.fecha_ingreso = fec_ing;
		this.oPersona = oPer;		
  }
  
  public String mostrar() {
	  return this.oPersona.mostrar() + " - Fecha ingreso: " + this.fecha_ingreso;
  }

}
