package procesadoresDinamicos;

public class ComparadorPorMemoria extends ComparadorDeTareas {

	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getUsoMemoria() < t2.getUsoMemoria();
	}

}
