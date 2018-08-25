import java.util.Collection;
import java.util.Vector;

public class Carrera {

  private Integer ID;
  private String nombre;

  private Collection<Catedra> myCatedra;
  
  public Carrera(Integer ID, String nom) {
	  this.ID = ID;
	  this.nombre = nom;
	  this.myCatedra = new Vector<Catedra>();
  }
  
  public void listarSi(Catedra oCatedra) {
	  System.out.println("Carrera: " + this.nombre);
	  System.out.println();
		
	  oCatedra.listarComisiones();	
		
	  System.out.println();
  }

  public void agregarCatedra(Catedra oCatedra) {
	  myCatedra.add(oCatedra);
  }

}