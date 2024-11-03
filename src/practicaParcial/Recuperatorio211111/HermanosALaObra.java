package practicaParcial.Recuperatorio211111;

public class HermanosALaObra extends Combo {
    private static final String CATEGORIA_REQUERIDA = "Decoración moderna";

    public HermanosALaObra(double descuentoPorProducto, double maxDescuento) {
        super(descuentoPorProducto, maxDescuento);
    }

    @Override
    public void addElemento(ElementoProducto elemento) {
        // Verifica que el elemento pertenezca a la categoría requerida.
        if (elemento.tieneCategoria(CATEGORIA_REQUERIDA)) {
            super.addElemento(elemento);
        }
    }
}
