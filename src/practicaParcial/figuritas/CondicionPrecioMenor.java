package practicaParcial.figuritas;

import practicaParcial.figuritas.condiciones.Condicion;

public class CondicionPrecioMenor extends Condicion {

    private double precio;

    public CondicionPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Figurita f) {
        return f.getNumero() < this.precio;
    }
}