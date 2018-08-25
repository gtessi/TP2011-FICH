import java.util.ArrayList;

public abstract class Componente {
	private String nombre;
	protected Componente oPadre;
	
	public Componente(String nom) {
		this.nombre = nom;
	}
	
	public abstract void agregar(Componente oComponente);
	
	public abstract void mostrar(int i);
	
	public String mostrarNombre() {
		return this.nombre;
	}

	public String mostrarNombrePadre() {
		String n;
		if(oPadre != null){
			n = this.oPadre.mostrarNombre() + ".";
		}
		else n="";
		return n;
		//return this.oPadre.mostrarNombre();
	}
		
	public ArrayList<Componente> getHijos() {
		return new ArrayList<Componente>();
	}

}
