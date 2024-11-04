package tp11.collectors.condiciones;

import tp11.collectors.ComponenteColeccion;


public class CondicionPorPesoMenor extends Condicion {
    private double peso;

    public CondicionPorPesoMenor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ComponenteColeccion c) {
        return c.getPeso() < this.peso;
    }
}
