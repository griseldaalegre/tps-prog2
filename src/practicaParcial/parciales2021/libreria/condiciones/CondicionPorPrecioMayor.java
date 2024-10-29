package practicaParcial.parciales2021.libreria.condiciones;

import practicaParcial.parciales2021.libreria.ComponenteLibreria;

public class CondicionPorPrecioMayor extends Condicion {
    private double precioMayor;

    public CondicionPorPrecioMayor(double precioMayor) {
        this.precioMayor = precioMayor;
    }

    @Override
    public boolean cumple(ComponenteLibreria c) {
        return c.getPrecio() > this.precioMayor;
    }
}
