package practicaParcial.parciales2024.jugueteria.condiciones;

import practicaParcial.parciales2024.jugueteria.ComponenteJuego;

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
