package procesadores;

public class ProcesadorPorOrden extends Procesador {

	public boolean esMenor(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// Solucion provisoria dado el enunciado inicial
	@Override
	public void addTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

}
