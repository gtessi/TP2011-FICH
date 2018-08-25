
public class Jefe extends Trabajador {
	private float sueldo;
	
	public Jefe(String n, String a, int d, int dir, int s) {
		super(n, a, d, dir);
		sueldo=s;		
	}

	
	public float calc_sueldo(Periodo oPeriodo) {
		return sueldo;
	}
	
}
