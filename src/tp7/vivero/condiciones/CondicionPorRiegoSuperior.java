package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorRiegoSuperior extends Condicion {
    private int riegoSuperior;

    public CondicionPorRiegoSuperior(int riegoSuperior) {
        this.riegoSuperior = riegoSuperior;
    }

    public boolean cumple(Planta p) {
        return p.getRiego() > this.riegoSuperior;
    }
}
