package procesadoresCompletoDinamico;

public class ColaDeTareasLIFO extends ColaDeTareas {

	@Override
	public void addTarea(Tarea tarea) {
		this.tareas.add(0, tarea);
	}

}
