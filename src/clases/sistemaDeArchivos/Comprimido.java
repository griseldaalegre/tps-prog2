package clases.sistemaDeArchivos;

public class Comprimido extends Carpeta {
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }
}
