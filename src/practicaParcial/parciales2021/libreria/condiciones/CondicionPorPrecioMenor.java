package practicaParcial.parciales2021.libreria.condiciones;

import practicaParcial.parciales2021.libreria.ComponenteLibreria;

public class CondicionPorPrecioMenor extends Condicion {
    private double precioMenor;

    public CondicionPorPrecioMenor(double precioMenor) {
        this.precioMenor = precioMenor;
    }

    @Override
    public boolean cumple(ComponenteLibreria c) {
        return c.getPrecio() < this.precioMenor;
    }
}
