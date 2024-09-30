package clases.centroComputo;

public class Computadora extends Elemento{
	private boolean disponible;
	private double velocidad;

	
	public Computadora(boolean disponible, double velocidad) {
		super();
		this.disponible = disponible;
		this.velocidad = velocidad;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void ejecutarTarea(Tarea t1) {
		t1.ejecutar();
		
	}

	@Override
	public boolean esMenor(Elemento obj) {
		return this.getVelocidad() < ((Computadora) obj).getVelocidad();
	}
	
	
}
