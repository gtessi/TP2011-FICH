import java.util.Collection;
import java.util.Vector;


public class Piso {
	private int piso;
	private Collection<Local> cLocales;
	
	public Piso(int piso) {
		this.piso = piso;
		this.cLocales = new Vector<Local>();
	}
	
	public void agregarLocal(String nom, float sup, String ubicacion) {
		Local oLocal = new Local(nom, sup, ubicacion);
		this.cLocales.add(oLocal);
	}

	public void listarBares() {
		for(Local oLocal: cLocales) {
			oLocal.mostrarBar(piso);
		}
		
	}

public void listarLocales() {
		for(Local oLocal: cLocales) {
			oLocal.mostrarCategoria(piso);
		}
		
	}
}
