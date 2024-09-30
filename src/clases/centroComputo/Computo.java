package clases.centroComputo;


public class Computo {
	private ColaEspera tarea;
	private ColaEspera comp;

	public Computo() {
		super();
		this.tarea = new ColaEspera();
		this.comp = new ColaEspera();
	}

	public void addComputadora(Computadora compu) {
		if(tarea.tieneElementos()) {
			Tarea t1 = (Tarea) tarea.getPrimero();
			if(compu.isDisponible()) {
				compu.ejecutarTarea(t1);
			}else {
				comp.addProceso(compu);
			}
		}
	}
	
	public void addTarea(Tarea tt) {
		if(comp.tieneElementos()) {
			Computadora libre = (Computadora) comp.getPrimero();
			libre.ejecutarTarea(tt);
		 }else {
			 tarea.addProceso(tt);
		 }
		
	}
//	public void ejecutar() {
//		Elemento t1 = colaT.getPrimera();
//		for(int i=0; i<computadoras.size();i++) {
//			Computadora cc = computadoras.get(i);
//			if(cc.isDisponible()) {
//				cc.ejecutarTarea(t1);
//			}else {
//				colaT.addTarea(t1);
//			}
//				
//		}
//	}
	
	
}
