import java.util.Vector;


public class Vuelo {
	private Vector<Asiento> cAsientos;
	
	public Vuelo(){
		this.cAsientos = new Vector<Asiento>();
	}
	
	public void agregarAsiento(Asiento oAsiento){
		this.cAsientos.add(oAsiento);
	}
	
	public int asientosTotales(){
		int total = this.cAsientos.size();
		
		return total;
	}
	
	public int asientosDisponibles(){
		int total = 0;
		
		for (Asiento oAsiento: this.cAsientos)
			if (oAsiento.mostrarEstado() == "Disponible")
				total++;
		
		return total;
	}
	
	public void reservarAsientos(int cant){
		int i = 0, c = cant;
		Asiento oAsiento = cAsientos.firstElement();
		
		while (c != 0){
			if (oAsiento.mostrarEstado() == "Disponible"){
				oAsiento.modificarEstado("Reservado");
				c--;				
			}
			i++;
			oAsiento = cAsientos.elementAt(i);
		}				
	}
	
	public void reservarAsientos(int vent, int pas){
		int i = 0, v = vent, p = pas;
		Asiento oAsiento = cAsientos.firstElement();
		
		while (v != 0){
			if ((oAsiento.mostrarEstado() == "Disponible") && (oAsiento.mostrarUbicacion() == "Ventana")){
				oAsiento.modificarEstado("Reservado");
				v--;				
			}
			i++;
			oAsiento = cAsientos.elementAt(i);
		}
		
		i = 0;
		oAsiento = cAsientos.firstElement();
		
		while (p != 0){
			if ((oAsiento.mostrarEstado() == "Disponible") && (oAsiento.mostrarUbicacion() == "Pasillo")){
				oAsiento.modificarEstado("Reservado");
				p--;				
			}
			i++;
			oAsiento = cAsientos.elementAt(i);
		}
	}
	
	
}
