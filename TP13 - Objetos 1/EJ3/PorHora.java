import java.util.ArrayList;


public class PorHora extends Trabajador{

	private ArrayList <Horasxmes> cHoras;
	private float sueldopri40;
	private float sueldopos40;
	
	
	public PorHora(String n, String a, int d, int dir, float m40, float mas40, Jefe P) {
		super(n, a, d, dir);
		sueldopri40=m40;
		sueldopos40=mas40;
		cHoras=new ArrayList<Horasxmes> ();
	}

	public void agregahs(Periodo T, int hs) { //agrega hs a un periodo
		cHoras.add(new Horasxmes(this,T,hs));
	}
	
	public float calc_sueldo(Periodo oPeriodo) {
			float res=0;
			for(int i=0; i<cHoras.size();i++){
				Horasxmes Temp=cHoras.get(i);
				if(Temp.mostrarP().equals(oPeriodo)){
					res+=Temp.calc_sueldo(sueldopri40, sueldopos40);
				}
			}
			return res;
	}

}
