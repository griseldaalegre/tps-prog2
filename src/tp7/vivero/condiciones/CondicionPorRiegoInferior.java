package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorRiegoInferior extends Condicion {
    private int riegoInferior;

    public CondicionPorRiegoInferior(int riegoInferior) {
        this.riegoInferior = riegoInferior;
    }

    public boolean cumple(Planta p) {
        return p.getRiego() < this.riegoInferior;
    }
}
