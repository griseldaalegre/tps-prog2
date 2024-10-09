package clases.centroDeComputosConInterfaces;

public class Computadora extends Dispositivo implements Elemento {

    private double velocidad;

    private Proceso procEjecutando;

    public Computadora(int inventario, String sala, double velocidad) {
        super(inventario, sala);
        this.velocidad = velocidad;
        this.procEjecutando = null;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void asignarProceso(Proceso p) {
        procEjecutando = p;
    }

    public void liberar(){
        procEjecutando = null;
    }

    @Override
    public boolean mayor(Elemento otro) {
        return this.getVelocidad() > ((Computadora)otro).getVelocidad();
    }

    @Override
    public String toString(){
        return this.getInventario()+" ("+this.getVelocidad()+")";
    }
}
