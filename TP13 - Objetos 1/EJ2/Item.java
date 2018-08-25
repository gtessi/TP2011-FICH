
public class Item {
	private int cantidad;
	private Producto oProducto;
	
	public Item(int cant, Producto oProd) {
		cantidad = cant;
		oProducto = oProd;
	}
	
	public float calcularPrecio() {
		return this.oProducto.mostrarPrecio()*this.cantidad;
	}
	
	public String mostrarItem() {
		return this.oProducto.mostrarNombre() + "     " + this.cantidad + "unid.     $" + this.calcularPrecio() + ".-";
	}
}
