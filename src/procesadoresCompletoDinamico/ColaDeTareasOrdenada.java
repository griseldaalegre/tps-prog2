package procesadoresCompletoDinamico;

public class ColaDeTareasOrdenada extends ColaDeTareas {
	
	private ComparadorDeTareas comparador;
	
	public ColaDeTareasOrdenada(ComparadorDeTareas comparador) {
		super();
		this.comparador = comparador;
	}

	@Override
	public void addTarea(Tarea tarea) {
		int i = 0; 
		while (i < this.tareas.size() &&
				comparador.esMenor(this.tareas.get(i), tarea)) {
			i++;
		}
		
		if (i < this.tareas.size())
			this.tareas.add(i, tarea); // NO VALIDO PARA PROG1
		else
			this.tareas.add(tarea);

	}

}
