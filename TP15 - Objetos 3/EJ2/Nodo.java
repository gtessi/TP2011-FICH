import java.util.ArrayList;

public class Nodo extends Componente {
    
	private ArrayList<Componente> cComponentes;
	
	public Nodo(String nom, Nodo padre) {
		super(nom);
		this.cComponentes = new ArrayList<Componente>();
		this.oPadre = padre;
	}
	
	public Nodo(String nom) {
		super(nom);
		this.cComponentes = new ArrayList<Componente>();
	}
	
	public void agregar(Componente oComponente) {
		this.cComponentes.add(oComponente);		
		oComponente.oPadre = this;
	}
	
	//public void remover(Componente oComponente) { cComponentes.remove(oComponente); }
	
	public void mostrar(int profundidad) {
		System.out.println("Nodo " + super.mostrarNombrePadre() + super.mostrarNombre() + " - nivel " + profundidad);
		for (int i=0; i< cComponentes.size(); i++)
			cComponentes.get(i).mostrar(profundidad + 1);
	}

	public ArrayList<Componente> getHijos() {
		return this.cComponentes;
	}
}
