package procesadoresCompletoDinamico;

import java.util.ArrayList;

public abstract class ColaDeTareas {
	
	protected ArrayList<Tarea> tareas;
	
	public ColaDeTareas() {
		this.tareas = new ArrayList<>();
	}
	
	public abstract void addTarea(Tarea tarea);

	public boolean tieneElementos() {
		return !this.tareas.isEmpty();
	}
	
	public int size() {
		return this.tareas.size();
	}

	public Tarea get() {
		return this.tareas.remove(0);
	}
	
	@Override
	public String toString() {
		return this.tareas.toString();
	}

}
