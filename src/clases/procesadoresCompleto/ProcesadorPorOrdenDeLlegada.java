package clases.procesadoresCompleto;


public class ProcesadorPorOrdenDeLlegada extends Procesador {
	
	@Override
	public void addTarea(Tarea tarea) {
		// Inserta siempre al final
		this.tareas.add(tarea);
	}

}
