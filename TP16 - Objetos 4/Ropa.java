
public class Ropa {
	private Local oLocal;
	private Hombre oHombre;
	private Mujer oMujer;
	
	public Ropa(Local oLoc){
		this.oLocal = oLoc;
		oLoc.asignarRopa(this);
	}
	
	public void asignarHombre(Hombre oHom){
		this.oHombre = oHom;
	}
	
	public void asignarMujer(Mujer oMuj){
		this.oMujer = oMuj;
	}
	
	public float mostrarSuperficie() {
		return this.oLocal.mostrarSuperficie();
	}
}
