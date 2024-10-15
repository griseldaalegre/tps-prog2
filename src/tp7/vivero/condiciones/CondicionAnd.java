package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Planta p) {
        return this.c1.cumple(p) && this.c2.cumple(p);
    }
}
