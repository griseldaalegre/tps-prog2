package procesadoresDinamicos;

public class ComparadorPorPrioridad extends ComparadorDeTareas {

	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() < t2.getPrioridad();
	}

}
