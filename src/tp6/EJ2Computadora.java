package tp6;

public class EJ2Computadora extends EJ2ElementoCola {
    private String nombre;
    private double velocidadCPU;
    private EJ2Proceso proc;

    public EJ2Computadora(String nombre, double velocidadCPU) {
        this.nombre = nombre;
        this.velocidadCPU = velocidadCPU;
        this.proc = null;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public String getNombre() {
        return nombre;
    }

    public void ejecutarProceso(EJ2Proceso proc) {
        this.proc = proc;
    }

    @Override
    public String toString() {
        return "EJ2Computadora{" +
                "velocidadCPU=" + velocidadCPU +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean esMayor(EJ2ElementoCola elemento) {
        return false;
    }
}
