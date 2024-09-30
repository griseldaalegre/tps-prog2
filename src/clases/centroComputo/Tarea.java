package clases.centroComputo;

public class Tarea extends Elemento {
	private int nroTarea;
	private double reqMemoria;

	public Tarea(int nroTarea, double reqMemoria) {
		this.nroTarea = nroTarea;
		this.reqMemoria = reqMemoria;
	}

	public double getReqMemoria() {
		return reqMemoria;
	}

	public void setReqMemoria(double reqMemoria) {
		this.reqMemoria = reqMemoria;
	}

	public int getNroTarea() {
		return nroTarea;
	}

	public void setNroTarea(int nroTarea) {
		this.nroTarea = nroTarea;
	}
	
	public void ejecutar() {
		System.out.println("Se ejecuto tarea: " + this.nroTarea + " Requerimiento: " + this.getReqMemoria() );
	}

	@Override
	public boolean esMenor(Elemento obj) {
		return this.getReqMemoria() < ((Tarea) obj).getReqMemoria();
	}
}
