package clases.procesadores;
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
	
	// Insertar ordenado
	public void addTarea(Tarea tarea) {
		int i = 0; 
		while (i < this.tareas.size() &&
				this.esMenor(this.tareas.get(i), tarea)) {
			i++;
		}
		
		if (i < this.tareas.size())
			this.tareas.add(i, tarea); // NO VALIDO PARA PROG1
		else
			this.tareas.add(tarea);
	}
	
	public abstract boolean esMenor(Tarea t1, Tarea t2);

}
