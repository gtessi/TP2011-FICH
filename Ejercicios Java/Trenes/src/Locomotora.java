
public class Locomotora {
	private float peso;
	private float pesoMaximo;
	private float velocidadMaxima;
	
	public Locomotora(float p, float pm, float vm){
		this.peso = p;
		this.pesoMaximo = pm;
		this.velocidadMaxima = vm;
	}
	
	public float arrastreUtil(){
		float total = this.peso - this.pesoMaximo;
		
		return total;
	}
	
	public float mostrarVelocidad(){
		return this.velocidadMaxima;
	}
	
	public float mostrarPeso(){
		return this.peso;
	}
}
