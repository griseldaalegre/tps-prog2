package clases.procesadores;
public class ProcesadorPorMemoria extends Procesador {

	
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getUsoMemoria() < t2.getUsoMemoria();
	}

}
