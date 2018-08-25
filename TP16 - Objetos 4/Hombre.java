
public class Hombre {
	private Ropa oRopa;
	
	public Hombre(Ropa oRop){
		this.oRopa = oRop;
		oRop.asignarHombre(this);
	}
}
