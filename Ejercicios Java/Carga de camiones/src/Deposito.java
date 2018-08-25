import java.util.Vector;


public class Deposito {
	private Vector<Camion> cCamiones;
	
	public Deposito(){
		this.cCamiones = new Vector<Camion>();		
	}
	
	public float totalCargaViajando(){
		float suma = 0;
		
		for (Camion oCamion: this.cCamiones)
			if (oCamion.estaEnViaje())
				suma += oCamion.mostrarPesoActual();
		
		return suma;
	}
	
	public void cargandoTipo(String t){
		for (Camion oCamion: cCamiones)
			if (!(oCamion.estaListoParaPartir()))
				oCamion.detalleTipo(t);				
	}
	
	public void mayorCantidad(){
		int cantidadMaxima = 0;
		
		for (Camion oCamion: cCamiones)
			if (oCamion.cantidadTotal() < cantidadMaxima)
				cantidadMaxima = oCamion.cantidadTotal();
		
		System.out.println("El camion con mayor cantidad lleva " + Integer.toString(cantidadMaxima));
	}
	
	
}
