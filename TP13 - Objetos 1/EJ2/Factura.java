import java.util.Collection;
import java.text.DateFormat;

public class Factura {
    private int codigo;
    private DateFormat fecha;
    
	private Collection<Item> cItems;
        
    public Factura(int cod, DateFormat fec) {
    	codigo = cod;
    	fecha = fec;
    }
    
    public float calcularTotal() {
    	float suma = 0;
    	for(Item oItem: this.cItems) {
    		suma+=oItem.calcularPrecio();
    	}
    	
    	return suma;
    }    
    
    public String mostrarCodigo() {
    	return "Factura nro. " + this.codigo;
    }
    
    public String mostrarTotal() {
    	return "Total $ " + this.calcularTotal() + ".-";
    }
    
    public String mostrarFecha() {
    	return "Fecha " + this.fecha.toString();
    }
}
