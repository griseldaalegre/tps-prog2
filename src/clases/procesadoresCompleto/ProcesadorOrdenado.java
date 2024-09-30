package clases.procesadoresCompleto;


public abstract class ProcesadorOrdenado extends Procesador {

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
