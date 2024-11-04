package tp11.collectors.condiciones;

import tp11.collectors.ComponenteColeccion;

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
