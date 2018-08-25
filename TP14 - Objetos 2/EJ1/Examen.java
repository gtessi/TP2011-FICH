import java.util.Date;


public class Examen {
	float nota;
	float valor;
	Date fecha;
		
	public float mostrarNota() {
		if(nota>=6) {
			valor=nota;
		}
		else {
			valor=-1;
		}
		return valor;
	}
	
}
