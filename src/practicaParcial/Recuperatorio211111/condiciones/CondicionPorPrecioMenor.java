package practicaParcial.Recuperatorio211111.condiciones;

import practicaParcial.Recuperatorio211111.ElementoProducto;

public class CondicionPorPrecioMenor extends Condicion {
    private double precio;

    public CondicionPorPrecioMenor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(ElementoProducto e) {
        return e.getPrecio() < this.precio;
    }
}
