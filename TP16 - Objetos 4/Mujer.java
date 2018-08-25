
public class Mujer {
	private Ropa oRopa;
	
	public Mujer(Ropa oRop){
		this.oRopa = oRop;
		oRop.asignarMujer(this);
	}
}
