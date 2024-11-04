package practicaParcial.adicionalJornadaEstudio;

public class LivianoEsGratis extends Combo {
    public LivianoEsGratis(double descuentoPorProducto, double maxDescuento) {
        super(descuentoPorProducto, maxDescuento);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() - this.getProductoMenorPeso().getPrecio();
    }
}
