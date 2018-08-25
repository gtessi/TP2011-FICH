import java.util.Vector;

public class Sistema {
	private Vector<Vehiculo> cVehiculos;
	
	public Sistema(){
		this.cVehiculos = new Vector<Vehiculo>();
	}
	
	public void vehiculosVelocidadMaxima(float km){
		for (Vehiculo oVehiculo: this.cVehiculos){
			float velocidad = oVehiculo.velocidadMaxima();
			
			if (velocidad > km)
				System.out.println(oVehiculo.mostrarSerie() + " - " + velocidad);
		}
	}
	
	public void vehiculosConsumo100km(float param){
		for (Vehiculo oVehiculo: this.cVehiculos){
			float gasto = oVehiculo.gastoCada100Km();
			
			if (gasto < param)
				System.out.println(oVehiculo.mostrarSerie() + " - " + gasto);
		}
	}
	
	public Vehiculo vehiculoMayorEficiencia(){
		Vehiculo oVehiculoEficiente = null;
		float mejorCoeficiente = 0;
		
		for (Vehiculo oVehiculo: this.cVehiculos){
			float coeficiente = (oVehiculo.cantidadDePasajeros() * oVehiculo.velocidadMaxima()) / oVehiculo.gastoCada100Km();
			
			if (coeficiente > mejorCoeficiente){
				oVehiculoEficiente = oVehiculo;
				mejorCoeficiente = coeficiente;
			}						
		}
		
		return oVehiculoEficiente;
	}
	
	public void vehiculosPasajerosVelocidad(float km){
		for (Vehiculo oVehiculo: this.cVehiculos){
			float velocidad = oVehiculo.velocidadMaxima();
			
			if (velocidad > km)
				System.out.println(oVehiculo.mostrarSerie() + " - " + velocidad + " - " + Integer.toString(oVehiculo.cantidadDePasajeros()));
		}
	}
	
}
