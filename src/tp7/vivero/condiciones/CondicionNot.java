package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionNot extends Condicion {
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Planta p) {
        return !this.c1.cumple(p);
    }
}
