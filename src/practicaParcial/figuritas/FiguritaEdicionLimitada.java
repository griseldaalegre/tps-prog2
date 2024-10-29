package practicaParcial.figuritas;

public class FiguritaEdicionLimitada extends Figurita {
    private int unidadesDisponibles;
    private Calculador calculador;

    public FiguritaEdicionLimitada(String nombre, int numero, double precio, int unidadesDisponibles, Calculador calculador) {
        super(nombre, numero, precio);
        this.unidadesDisponibles = unidadesDisponibles;
        this.calculador = calculador;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    @Override
    public double getPrecio() {
        double precioNuevo = calculador.calcular(this);
        double miPrecio = super.getPrecio();
        if (precioNuevo >= miPrecio) {
            return precioNuevo;
        }
        return miPrecio;
    }
}
