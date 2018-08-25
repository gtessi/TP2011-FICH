public class Hoja extends Componente {
		
	public Hoja(String nom, Nodo padre) {
		super(nom);
		this.oPadre = padre;
	}
	
	public void agregar(Componente oComponente) {}

	public void mostrar(int i) {
		System.out.print("Hoja " + super.mostrarNombrePadre()+ super.mostrarNombre());
		System.out.println();
		
	}
}
