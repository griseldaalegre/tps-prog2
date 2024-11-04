package practicaParcial.parciales2023.recuperatorio2023.condiciones;

import practicaParcial.parciales2023.recuperatorio2023.ComponenteAcademia;

public class CondicionPrecioMenor extends Condicion {
    private double precioMaximo;

    public CondicionPrecioMenor(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    @Override
    public boolean cumple(ComponenteAcademia c) {
        return c.getPrecio() < precioMaximo;
    }
}
