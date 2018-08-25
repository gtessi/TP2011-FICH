import java.util.Vector;


public class Camion {
	private float carga_max;
	private String estado;
	
	private Vector<Caja> cCajasSueltas;
	private Vector<Bulto> cBultos;
	private Vector<Bidon> cBidones;
	
	public Camion(float c_m){
		this.carga_max = c_m;
		this.estado = "Disponible";
		
		this.cCajasSueltas = new Vector<Caja>();
		this.cBultos = new Vector<Bulto>();
		this.cBidones = new Vector<Bidon>();
	}
	
	public void actualizarEstado(String nuevo_estado){
		if ((nuevo_estado == "Disponible") || (nuevo_estado == "De viaje") || (nuevo_estado == "En reparacion"))
			this.estado = nuevo_estado;
	}
	
	public float mostrarPesoActual(){
		float
			total = 0,
			totalCajasSueltas = 0,
			totalBidones = 0,
			totalBultos = 0;
		
		for (Caja oCaja: cCajasSueltas)
			totalCajasSueltas += oCaja.mostrarPeso();
		
		for (Bulto oBulto: cBultos)
			totalBultos += oBulto.pesoTotalBulto();
		
		for (Bidon oBidon: cBidones)
			totalBidones += oBidon.mostrarPeso();
		
		total = totalCajasSueltas + totalBultos + totalBidones;
		
		return total;
	}
	
	public void agregarCaja(Caja oCaja){
		if (this.puedeAceptarCarga(oCaja))
			this.cCajasSueltas.add(oCaja);
		else
			System.out.println("No se puede cargar la caja");
	}
	
	public void agregarBulto(Bulto oBulto){
		if (this.puedeAceptarCarga(oBulto))
			this.cBultos.add(oBulto);
		else
			System.out.println("No se puede cargar el bulto");
	}
	
	public void agregarBidon(Bidon oBidon){
		if (this.puedeAceptarCarga(oBidon))
			this.cBidones.add(oBidon);
		else
			System.out.println("No se puede cargar el bidón");
	}
	
	public float capacidadRestante(){
		float total = this.carga_max - this.mostrarPesoActual();
		
		return total;
	}
	
	public boolean puedeAceptarCarga(Caja oCaja){
		boolean resultado = false;
		
		if ((oCaja.mostrarPeso() <= this.capacidadRestante()) && (this.estado == "Disponible"))
			resultado = true;
		
		return resultado;
	}
	
	public boolean puedeAceptarCarga(Bulto oBulto){
		boolean resultado = false;
		
		if ((oBulto.pesoTotalBulto() <= this.capacidadRestante()) && (this.estado == "Disponible"))
			resultado = true;
		
		return resultado;
	}
	
	public boolean puedeAceptarCarga(Bidon oBidon){
		boolean resultado = false;
		
		if ((oBidon.mostrarPeso() <= this.capacidadRestante()) && (this.estado == "Disponible"))
			resultado = true;
		
		return resultado;
	}
	
	public boolean estaListoParaPartir(){
		boolean resultado = false;
		float
			cargaActual = (this.mostrarPesoActual() * 100) / this.carga_max,
			carga75 = (float) (0.75 * this.carga_max);
		
		if ((this.estado == "Disponible") && (cargaActual >= carga75))
			resultado = true;
		
		return resultado;
	}
	
	public boolean estaEnViaje(){
		boolean resultado = false;
		
		if (this.estado == "De viaje")
			resultado = true;
		
		return resultado;
	}
	
	public void detalleElementos(){
		System.out.println("Cajas sueltas:");
		System.out.println("Contenido - Peso");
		
		for (Caja oCaja: this.cCajasSueltas)
			System.out.println(oCaja.mostrarContenido());
		
		System.out.println("Bultos:");
		System.out.println("Contenido - Peso");
		
		for (Bulto oBulto: this.cBultos)
			System.out.println(oBulto.mostrarContenido());
		
		System.out.println("Bidones:");
		System.out.println("Contenido - Densidad - Peso");
		
		for (Bidon oBidon: this.cBidones)
			System.out.println(oBidon.mostrarContenido());
	}
	
	public void detalleTipo(String t){
		System.out.println("Cajas sueltas:");
		System.out.println("Contenido");
		
		for (Caja oCaja: this.cCajasSueltas)
			if (oCaja.tipo() == t)
				System.out.println(oCaja.tipo());
		
		System.out.println("Bultos:");
		System.out.println("Contenido");
		
		for (Bulto oBulto: this.cBultos)
			if (oBulto.tipo() == t)
				System.out.println(oBulto.mostrarContenido());
		
		System.out.println("Bidones:");
		System.out.println("Contenido");
		
		for (Bidon oBidon: this.cBidones)
			if (oBidon.tipo() == t)
				System.out.println(oBidon.mostrarContenido());
		
	}
	
	public String objetoMasLiviano(){
		String cadena = "Más liviano: ";
		float menorpeso = 0;
		
		for (Caja oCaja: this.cCajasSueltas)
			if (oCaja.mostrarPeso() < menorpeso){
				cadena += oCaja.mostrarContenido();
				menorpeso = oCaja.mostrarPeso();
			}
		
		for (Bulto oBulto: this.cBultos)
			if (oBulto.pesoTotalBulto() < menorpeso){
				cadena += oBulto.mostrarContenido();
				menorpeso = oBulto.pesoTotalBulto();
			}
		
		for (Bidon oBidon: this.cBidones)
			if (oBidon.mostrarPeso() < menorpeso){
				cadena += oBidon.mostrarContenido();
				menorpeso = oBidon.mostrarPeso();
			}
		
		return cadena;
	}
	
	public int cantidadTotal(){
		int suma = this.cCajasSueltas.size() + this.cBultos.size() + this.cBidones.size();
		
		return suma;		
	}
	
	
}
