import java.util.Vector;


public class Formacion {
	private Vector<Locomotora> cLocomotoras;
	private Vector<Pasajeros> cPasajeros;
	private Vector<Carga> cCargas;
	
	public Formacion(Locomotora oLoco, Carga oCar, Pasajeros oPas){
		this.cLocomotoras.add(oLoco);
		
		if(oCar == null && oPas != null)
			this.cPasajeros.add(oPas);
		else if(oCar != null && oPas == null)
			this.cCargas.add(oCar);
		else if(oCar != null && oPas != null){
			this.cPasajeros.add(oPas);
			this.cCargas.add(oCar);
		}
		else
			System.out.println("Error");
	}
	
	public void agregarLocomotora(Locomotora oLoco){
		this.cLocomotoras.add(oLoco);
	}
	
	public void agregarCarga(Carga oCar){
		this.cCargas.add(oCar);
	}
	
	public void agregarPasajeros(Pasajeros oPas){
		this.cPasajeros.add(oPas);
	}
	
	public int totalPasajeros(){
		int total = 0;
		
		for(Pasajeros oPasajeros : cPasajeros){
			total += oPasajeros.cantidadPasajeros();
		}
		
		return total;		
	}
	
	public void vagonesLivianos(){
		int index = 0;
		
		for(Carga oCarga : cCargas)
			if(oCarga.pesoMaximo() < 2500){
				this.cCargas.indexOf(oCarga, index);
				System.out.println(index + " - " + oCarga.pesoMaximo());
			}
		
		for(Pasajeros oPasajeros : cPasajeros)
			if(oPasajeros.pesoMaximo() < 2500){
				this.cPasajeros.indexOf(oPasajeros, index);
				System.out.println(index + " - " + oPasajeros.pesoMaximo());
			}		
	}
	
	public float velocidadMaxima(){
		Locomotora oLoco = this.cLocomotoras.firstElement();
		
		float minimo = oLoco.mostrarVelocidad();
		
		for(Locomotora oLocomotora : cLocomotoras){			
			if(oLocomotora.mostrarVelocidad() <= minimo)
				minimo = oLocomotora.mostrarVelocidad();
		}
		
		return minimo;
	}
	
	public boolean esEficiente(){
		float total = 0;
		int cantidad = this.cLocomotoras.size();
		int cuenta = 0;
		boolean resultado;
		
		for(Locomotora oLocomotora : cLocomotoras){	
			total = oLocomotora.mostrarPeso() * 5;
			if(oLocomotora.arrastreUtil() > total)
				cuenta++;
		}
		
		if(cuenta == cantidad)
			resultado = true;
		else
			resultado = false;
		
		return resultado;
	}
	
	public boolean puedeMoverse(){
		float arrastreLocomotoras = 0;
		float pesoVagones = 0;
		boolean resultado;
		
		for(Locomotora oLocomotora : cLocomotoras)	
			arrastreLocomotoras += oLocomotora.arrastreUtil();
		
		for(Pasajeros oPasajeros : cPasajeros)	
			pesoVagones += oPasajeros.pesoMaximo();
		
		for(Carga oCarga : cCargas)	
			pesoVagones += oCarga.pesoMaximo();
		
		if(arrastreLocomotoras >= pesoVagones)
			resultado = true;
		else
			resultado = false;
		
		return resultado;
	}
	
	public float faltaEmpuje(){
		float arrastreLocomotoras = 0;
		float pesoVagones = 0;
		float total = 0;
		
		for(Locomotora oLocomotora : cLocomotoras)	
			arrastreLocomotoras += oLocomotora.arrastreUtil();
		
		for(Pasajeros oPasajeros : cPasajeros)	
			pesoVagones += oPasajeros.pesoMaximo();
		
		for(Carga oCarga : cCargas)	
			pesoVagones += oCarga.pesoMaximo();
		
		total = pesoVagones - arrastreLocomotoras;
		
		return total;
	}
	
	public Formacion vagonPesado(){
		return null;
		
	}
}
