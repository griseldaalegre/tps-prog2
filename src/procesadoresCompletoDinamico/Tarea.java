package procesadoresCompletoDinamico;

public class Tarea {

	private int prioridad;
	private double usoMemoria;
	private double usoCPU;
	
	public Tarea(int prioridad, double usoMemoria, double usoCPU) {
		this.prioridad = prioridad;
		this.usoMemoria = usoMemoria;
		this.usoCPU = usoCPU;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public double getUsoMemoria() {
		return usoMemoria;
	}

	public void setUsoMemoria(double usoMemoria) {
		this.usoMemoria = usoMemoria;
	}

	public double getUsoCPU() {
		return usoCPU;
	}

	public void setUsoCPU(double usoCPU) {
		this.usoCPU = usoCPU;
	}
	
	public void ejecutar() {
		System.out.println("Tarea ejecutada: " + this);
	}
	
	public String toString() {
		return "P: " + this.getPrioridad() + 
				" M: " + this.getUsoMemoria() + 
				" CPU: " + this.getUsoCPU();
	}
	
	
	
	
}
