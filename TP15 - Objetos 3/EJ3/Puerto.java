import java.util.Collection;


public class Puerto {
	private Collection<Amarra> cAmarras;
	
	public Puerto(Collection<Amarra> cA) {
		this.cAmarras = cA;
	}
	
	public void calcular_alquiler(int mes) {
		for(Amarra oAmarra : this.cAmarras) {
			oAmarra.calcular_alquiler(mes);
		}
	}
}
