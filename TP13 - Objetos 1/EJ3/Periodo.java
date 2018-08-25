import java.util.ArrayList;


public class Periodo {
	private ArrayList<Horasxmes> cHoras; 
	private ArrayList<Ventasxmes> cVentas;
	private int mes;
	private int anio;
	
	
	public Periodo(int m, int a){
		mes=m;
		anio=a;
		cHoras=new ArrayList <Horasxmes> ();
		cVentas=new ArrayList <Ventasxmes> ();
	}
	public void listarHoras(){
		
	}
	public void listaVentas(Comision O){
		O.verlist(this);
	}
}
