import java.util.Vector;


public class Shopping {
	private Vector<Piso> cPisos;
	
	public Shopping(Piso oPiso) {
		this.cPisos = new Vector<Piso>();
		this.cPisos.add(oPiso);
	}
	
	public void agregarPiso(Piso oPiso) {
		this.cPisos.add(oPiso);
	}
	
	public void listarBares() {
		for(Piso oPiso : cPisos){
			oPiso.listarBares();
		}
	}

	public void listarLocales() {
		for(Piso oPiso : cPisos){
			oPiso.listarLocales();
		}
	}
}
