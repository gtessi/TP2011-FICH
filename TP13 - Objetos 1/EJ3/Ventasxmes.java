
public class Ventasxmes {
	private int totalventas;
	private Comision cComision;
	private Periodo oPeriodo;
	
	public Ventasxmes(int t,Comision s, Periodo h){
		totalventas=t;
		cComision=s;
		oPeriodo=h;
	}	
	
	public Comision mostrar(){
		return this.cComision;
	}
	
	public Periodo mostrar2(){
		return this.oPeriodo;
	}
	
	public int mostrar3(){
		return this.totalventas;
	}	
}
