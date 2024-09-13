package procesadoresCompletoDinamico;

import java.util.ArrayList;

public class Procesador {
	
	protected ColaDeTareas colaDeTareas;
	
	public Procesador(ColaDeTareas nueva) {
		this.colaDeTareas = nueva;
	}
	
	public void setColaDeTareas(ColaDeTareas nueva) {
		int n = this.colaDeTareas.size();
		for (int i = 0; i < n; i++)
			nueva.addTarea(this.colaDeTareas.get());
		
		this.colaDeTareas = nueva;
	} 
	
	// Ejecuta una sola tarea, la primera de la lista
	public void ejecutar() {
		if (this.colaDeTareas.tieneElementos()) {
			// Recuperar la tarea que debo ejecutar
			Tarea t = this.colaDeTareas.get();
			t.ejecutar();
		}
	}
	
	public void addTarea(Tarea tarea) {
		this.colaDeTareas.addTarea(tarea);
	}
	
	@Override
	public String toString() {
		return this.colaDeTareas.toString();
	}

}
