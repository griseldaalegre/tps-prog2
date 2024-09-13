package procesadoresDinamicos;

public class ComparadorPorCPU extends ComparadorDeTareas {

	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		return  t1.getUsoCPU() < t2.getUsoCPU();
	}

}
