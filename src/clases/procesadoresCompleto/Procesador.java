package clases.procesadoresCompleto;


import java.util.ArrayList;

public abstract class Procesador {
	
	protected ArrayList<Tarea> tareas;
	
	public Procesador() {
		this.tareas = new ArrayList<>();
	}
	
	// Ejecuta una sola tarea, la primera de la lista
	public void ejecutar() {
		if (this.tareas.size() > 0) {
			// Recuperar la tarea que debo ejecutar
			Tarea t = this.tareas.remove(0);
			t.ejecutar();
		}
	}
	
	public abstract void addTarea(Tarea tarea);

}
