import java.util.Vector;

public class Persona {

  private String nombre;
  private String apellido;
  private Integer documento;
  private String domicilio;

  private Vector  myAlumno;
  
  public Persona(String nom, String ape, Integer doc, String dir) {
	  this.nombre = nom;
	  this.domicilio = dir;
	  this.apellido = ape;
	  this.documento = doc;
  }
	
  public String mostrar() {
	  return this.nombre + " - " + this.apellido + " - " + this.documento + " - " + this.domicilio; 
  }
}



	
