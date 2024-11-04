package practicaParcial.adicionalJornadaEstudio.condiciones;

import practicaParcial.adicionalJornadaEstudio.ElementoProducto;

public class CondicionPorPrecioMenor extends Condicion {
    private double precio;

    public CondicionPorPrecioMenor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(ElementoProducto e) {
        return e.getPrecio() < this.precio;
    }
}
