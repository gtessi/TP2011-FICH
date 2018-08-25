import java.util.Collection;
import java.util.Vector;

public class Universidad {

  private Integer ID;
  private String nombre;

  //private Vector<Carrera> cCarrera;
  Collection<Carrera> cCarrera;
  
  public Universidad(Integer Id, String nom){
	  this.ID = Id;
	  this.nombre = nom;
	  this.cCarrera = new Vector<Carrera>();
  }
  
  public void agregarCarrera(Carrera oCarrera){
	  cCarrera.add(oCarrera);
  }

  public void listar(Catedra oCatedra) {
		oCatedra.listarComisiones();
	}

}