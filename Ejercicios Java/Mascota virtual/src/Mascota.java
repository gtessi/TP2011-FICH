
public class Mascota {
	private int nivelContento;
	private int estado;
	//1 = aburrida
	//2 = hambrienta
	//3 = contenta
	
	public void comer(){
		if(this.estado == 2)
			this.estado = 3;
		else if(this.estado == 3)
			this.nivelContento++;
		else if(this.estado == 1)
			this.estado = 3;
	}
	
	public void jugar(){
		if(this.estado == 3)
			this.nivelContento += 2;
		else if(this.estado == 1)
			this.estado = 3;		
	}
	
	public boolean puedeJugar(){
		boolean resultado;
		
		if(this.estado == 3 || this.estado == 1)
			resultado = true;
		else
			resultado = false;
		
		return resultado;
	}
}
