
public abstract class Comida {
	private Local oLocal;
	private boolean esBar;
	private boolean esRestaurant;
		
	public Comida(Local oLoc, boolean Bar, boolean Resto){
		this.oLocal = oLoc;
		this.esBar = Bar;
		this.esRestaurant = Resto;
		oLoc.asignarComida(this);
	}	
	
	public float mostrarSuperficie() {
		return this.oLocal.mostrarSuperficie();
	}
	
	public boolean esBar() {
		return this.esBar;
	}
	
	public String mostrarBar() {
		return this.oLocal.mostrarUbicacion();
	}
}
