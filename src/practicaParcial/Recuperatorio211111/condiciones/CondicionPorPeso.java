package practicaParcial.Recuperatorio211111.condiciones;

import practicaParcial.Recuperatorio211111.ElementoProducto;

public class CondicionPorPeso extends Condicion {
    private double peso;

    public CondicionPorPeso(double peso) {
        this.peso = peso;
    }

    public boolean cumple(ElementoProducto e) {
        return e.getPeso() > this.peso;
    }
}
