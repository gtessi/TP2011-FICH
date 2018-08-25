
public class Libreria {
	private Local oLocal;
	
	public Libreria(Local oLoc){
		this.oLocal = oLoc;
		oLoc.asignarLibreria(this);
	}
	
	public float mostrarSuperficie() {
		return this.oLocal.mostrarSuperficie();
	}
}
