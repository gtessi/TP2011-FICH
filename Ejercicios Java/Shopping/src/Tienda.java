
public class Tienda {
	private String tipo;
	
	private Hombre oHombre;
	private Mujer oMujer;
	
	public Tienda(Hombre oHom){
		this.oHombre = oHom;
		this.oMujer = null;
		this.tipo = "Hombre";
	}
	
	public Tienda(Mujer oMuj){
		this.oMujer = oMuj;
		this.oHombre = null;
		this.tipo = "Mujer";
	}
	
	public Tienda(Hombre oHom, Mujer oMuj){
		this.oHombre = oHom;
		this.oMujer = oMuj;
		this.tipo = "Mixta";
	}
	
	public String mostrarTipo(){
		return tipo;
	}
}
