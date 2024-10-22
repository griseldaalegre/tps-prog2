package practicaParcial.jugueteria.condiciones;

import practicaParcial.jugueteria.ComponenteJuego;

public class CondicionPorPesoMenor extends Condicion {

    private double peso;

    public CondicionPorPesoMenor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ComponenteJuego c) {
        return c.getPeso() < this.peso;
    }
}
