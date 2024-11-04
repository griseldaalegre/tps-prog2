package practicaParcial.adicionalJornadaEstudio.condiciones;

import practicaParcial.adicionalJornadaEstudio.ElementoProducto;

public class CondicionPorPeso extends Condicion {
    private double peso;

    public CondicionPorPeso(double peso) {
        this.peso = peso;
    }

    public boolean cumple(ElementoProducto e) {
        return e.getPeso() > this.peso;
    }
}
