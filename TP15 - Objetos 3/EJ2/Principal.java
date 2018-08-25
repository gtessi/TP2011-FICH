public class Principal {

	
	
	public static void main(String[] args){
		Nodo Raiz = new Nodo("a");
		Hoja nb = new Hoja("b",Raiz);
		Nodo nc = new Nodo("c",Raiz);
		Hoja nd = new Hoja("d",Raiz);
		Raiz.agregar(nb);
		Raiz.agregar(nc);
		Raiz.agregar(nd);
		Hoja ne = new Hoja("e",nc);
		Hoja nf = new Hoja("f",nc);
		nc.agregar(ne);
		nc.agregar(nf);
		
		Raiz.mostrar(1);
		
	}
	
	
}