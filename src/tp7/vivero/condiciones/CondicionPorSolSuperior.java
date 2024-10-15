package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorSolSuperior extends Condicion {
    private int solSuperior;

    public CondicionPorSolSuperior(int solSuperior) {
        this.solSuperior = solSuperior;
    }

    public boolean cumple(Planta p) {
        return p.getSol() > this.solSuperior;
    }
}
