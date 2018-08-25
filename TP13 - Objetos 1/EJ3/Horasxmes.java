
public class Horasxmes {
		int horas;
		private Porjornal oJornal;
		private Periodo oPeriodo;
		
		public Horasxmes(Porjornal J, Periodo T, int hs){
			oJornal=J;
			oPeriodo=T;
			horas=hs;
		}
		
		public float calc_sueldo(float costomenor, float costomayor){
			float r=0;
			
			if(cant_hs>40){
				r=costomenor*horas;
				r+=(cant_hs-40)*costomayor;
			}
			else{
				r=costomenor*horas;
			}
			return r;
		}
		
		public Periodo mostrarP(){
			return this.oPeriodo;
		}
		
		public int mostrarhs(){
			return horas;
		}
		
}
