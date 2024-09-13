package procesadoresDinamicos;

import java.util.ArrayList;

public class Procesador {
	
	protected ArrayList<Tarea> tareas;
	private ComparadorDeTareas comparador;
	
	public Procesador(ComparadorDeTareas comparador) {
		this.tareas = new ArrayList<>();
		this.comparador = comparador;
	}
	
	public void setComparador(ComparadorDeTareas nuevo) {
		this.comparador = nuevo;
		ArrayList<Tarea> originales = this.tareas;
		this.tareas = new ArrayList<>();
		for (int i = 0; i < originales.size(); i++) {
			this.addTarea(originales.get(i));
		}
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
				this.comparador.esMenor(this.tareas.get(i), tarea)) {
			i++;
		}
		
		if (i < this.tareas.size())
			this.tareas.add(i, tarea); // NO VALIDO PARA PROG1
		else
			this.tareas.add(tarea);
	}

	
	@Override
	public String toString() {
		return this.tareas.toString();
	}
	
	protected ArrayList<Tarea> getTareas() {
		return new ArrayList<>(this.tareas);
	}

}
