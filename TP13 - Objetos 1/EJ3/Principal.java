
public class Principal {
	public static void main(String[] args){
	Comision A=new Comision ("Andres", "Estepa", 34511972, 2276, 40);
	Comision B=new Comision ("Juan", "Perez", 36214782,4578,30);
	
	Periodo uno=new Periodo(5,2010);
	Periodo dos=new Periodo(6,2010);
	
	A.agragarventa(uno, 30);
	A.agragarventa(uno, 50);
	A.agragarventa(dos, 20);
	
	B.agragarventa(uno, 50);
	B.agragarventa(dos, 90);
	
	uno.ListaVentas(A);
	
	System.out.print("Hola");
	
	
	
	
	
	}
}
