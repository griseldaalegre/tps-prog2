package practicaParcial.adicionalJornadaEstudio.condiciones;

import practicaParcial.adicionalJornadaEstudio.ElementoProducto;

public class CondicionPorPrecioMayor extends Condicion {
    private double precio;

    public CondicionPorPrecioMayor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(ElementoProducto e) {
        return e.getPrecio() >this.precio;
    }
}
