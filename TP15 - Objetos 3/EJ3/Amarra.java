import java.util.Collection;


public class Amarra {
	private int posicion;
	private Collection<Alquiler> cAlquileres;
	
	public Amarra(int pos) {
		this.posicion = pos;
	}
	
	public void calcular_alquiler(int mes) {
		for(Alquiler oAlquiler : this.cAlquileres) {
			System.out.println(oAlquiler.calcular_periodo(mes));
		}
	}
	
	public String mostrar() {
		String posTexto = this.posicion + "";
		return posTexto;
	}
}
