package clases.procesadoresCompleto;


public class ProcesadorPorPrioridad extends ProcesadorOrdenado {
	
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() < t2.getPrioridad();
	}
	
	

}
