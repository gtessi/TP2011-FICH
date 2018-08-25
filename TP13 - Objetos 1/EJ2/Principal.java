import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;


public class Principal {
	
	private Collection<Producto> cProductos;
	private Collection<Item> cItems;
	
	private DateFormat fecha = new SimpleDateFormat("01/05/2011");
	private Factura oFactura = new Factura(00010100,fecha);
	
	public Principal() {
		//this.cProductos = new Vector<Producto>();
		//this.cItems = new Vector<Item>();
	}
	
	Empresa oEmpresa = new Empresa("Mayorista S.A.","Monotributo");
	Cliente oCliente = new Cliente("Gilcomat SRL","R.I.","30-12345678-1");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal oPrincipal = new Principal();
		
		Producto oProducto1 = new Producto("Porcelanato 45x45",6);
		Producto oProducto2 = new Producto("Griferia FV 6 piezas",400);
		Item oItem1 = new Item(100,oProducto1);
		Item oItem2 = new Item(1,oProducto2);
		
		oPrincipal.cProductos.add(oProducto1);
		oPrincipal.cProductos.add(oProducto2);
		oPrincipal.cItems.add(oItem1);
		oPrincipal.cItems.add(oItem2);
		
		oPrincipal.imprimirFactura();
	}
	
	public void imprimirFactura() {
    	int c = 0; 	
    	
    	System.out.println(oEmpresa.mostrarNombre());
    	System.out.println();
    	System.out.println(oFactura.mostrarCodigo());
    	System.out.println("Cliente " + oCliente.mostrarNombre());
    	System.out.println(oFactura.mostrarFecha());
    	System.out.println(oFactura.mostrarTotal());
    	for(Item oItem : cItems) {
    		c+=1;
    		System.out.println("Detalle " + c + ": " + oItem.mostrarItem());
    	}
    	System.out.println("-------------------------------------");    	
    }

}
