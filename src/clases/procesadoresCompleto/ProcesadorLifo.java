package clases.procesadoresCompleto;

// Ultimo que entra, primero que sale
public class ProcesadorLifo extends Procesador {

	@Override
	public void addTarea(Tarea tarea) {
		// Inserta al principio
		this.tareas.add(0, tarea);

	}

}
