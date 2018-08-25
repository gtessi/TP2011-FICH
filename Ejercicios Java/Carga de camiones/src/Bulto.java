import java.util.Vector;


public class Bulto {
	private float peso_estructura;
	private Vector<Caja> cCajas;
	private String contenido;
	private float peso_caja;
	
	public Bulto(float p){
		this.peso_estructura = p;
		this.contenido = "";
		this.peso_caja = 0;
		this.cCajas = new Vector<Caja>();
	}
	
	public void agregarCaja(Caja oCaja){
		if ((this.contenido == "") && (this.peso_caja == 0)){
			this.contenido = oCaja.mostrarContenido();
			this.peso_caja = oCaja.mostrarPeso();
			this.cCajas.add(oCaja);
		}
		else if ((this.contenido == oCaja.mostrarContenido()) && (this.peso_caja == oCaja.mostrarPeso()))
			this.cCajas.add(oCaja);
	}
	
	public float pesoTotalBulto(){
		float total = 0;
		
		total = (this.peso_caja * this.cCajas.size()) + this.peso_estructura;
		
		return total;
	}
	
	public String mostrarContenido(){
		String cadena = this.contenido + " - " + Float.toString(this.pesoTotalBulto());
		
		return cadena;
	}
	
	public String tipo(){
		return this.contenido;
	}
	
}
