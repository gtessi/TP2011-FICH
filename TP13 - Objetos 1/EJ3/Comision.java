import java.util.ArrayList;


public class Comision extends Trabajador {
	
	private int porcentaje;
	private ArrayList<Ventasxmes> cVentas;
	
	
	public Comision(String n, String a, int d, int dir, int p) {
		super(n, a, d, dir);
		porcentaje=p;
		cVentas=new ArrayList <Ventasxmes> ();
	}

	public void agragarventa(Periodo T, int total){
		cVentas.add(new Ventasxmes(total,this,T));
	}
	
	public float calc_sueldo(Periodo oPeriodo) {
		return 0;
	}
	
	public void verlist(Periodo T){
		for(int i=0;i<cVentas.size();i++){
			Ventasxmes Temp=cVentas.get(i);
			if(Temp.mostrar2().equals(T)){
				System.out.print(this.mostrar()+Temp.mostrar3());
			}
		}
	}
	
	
	
}
