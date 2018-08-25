
public class Asiento {
	private int fila;
	private String columna;
	private String ubicacion;
	private String estado;
	
	public Asiento(int f, String col, String ubi, String est){
		this.fila = f;
		this.columna = col;
		this.ubicacion = ubi;
		this.estado = est;
	}
	
	public void modificarEstado(String est){
		this.estado = est;
	}
	
	public int mostrarFila(){
		return this.fila;
	}
	
	public String mostrarColumna(){
		return this.columna;
	}
	
	public String mostrarUbicacion(){
		return this.ubicacion;
	}
	
	public String mostrarEstado(){
		return this.estado;
	}
}
