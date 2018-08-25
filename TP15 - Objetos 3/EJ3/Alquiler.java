import java.util.Calendar;

public class Alquiler {
	private Calendar fecha;
	private float valor_fijo;
	
	private Barco oBarco;
	private Amarra oAmarra;
		
	public Alquiler(Calendar fec, float vf, Barco oB, Amarra oA) {
		this.fecha = fec;
		this.valor_fijo = vf;
		this.oBarco = oB;
		this.oAmarra = oA;		
	}
	
	public float liquidar() {
		return oBarco.modulo() * 30 * this.valor_fijo;//meses de 30 dias
	}
	
	public int mostrarMes() {
		int mes = fecha.get(Calendar.MONTH) + 1;//porque enero es 0
		return mes;
	}
	
	public String calcular_periodo(int mes) {
		String cadena = "";
		
		if(mes == this.mostrarMes()) {
			cadena = oBarco.mostrar() + " - Amarra: " + oAmarra.mostrar() + " - Total: $" + this.liquidar();
		}
		
		return cadena;
	}
}
