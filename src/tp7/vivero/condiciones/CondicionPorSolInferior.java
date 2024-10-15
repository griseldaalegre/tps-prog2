package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorSolInferior extends Condicion {
    private int solInferior;

    public CondicionPorSolInferior(int solInferior) {
        this.solInferior = solInferior;
    }

    public boolean cumple(Planta p) {
        return p.getSol() < this.solInferior;
    }
}
