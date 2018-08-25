import java.util.Calendar;


public class Alquiler {
	private Calendar fecha;
	private float valorFijo;
	
	private Amarra oAmarra;
	private Barco oBarco;
	private Cliente oCliente;
	
	public Alquiler(Calendar f, float vf, Amarra oAm, Barco oBar, Cliente oCli){
		this.fecha = f;
		this.valorFijo = vf;
		this.oAmarra = oAm;
		this.oBarco = oBar;
		this.oCliente = oCli;
	}
	
	public float calculo(){
		float total = 0;
				
		total = 30 * this.oBarco.modulo() * this.valorFijo;
		
		return total;
	}
	
	public int mostrarMes() {
		int mes = fecha.get(Calendar.MONTH) + 1;//porque enero es 0
		
		return mes;
	}
}
