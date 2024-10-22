package practicaParcial.collectors.condiciones;

import practicaParcial.collectors.ComponenteColeccion;

public class CondicionPorVolumenSuperior extends Condicion {
    private double volumen;

    public CondicionPorVolumenSuperior(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public boolean cumple(ComponenteColeccion c) {
        return c.getVolumen() > this.volumen;
    }
}
