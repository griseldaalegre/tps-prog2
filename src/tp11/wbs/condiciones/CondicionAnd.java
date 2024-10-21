package tp11.wbs.condiciones;

import tp11.wbs.ComponenteWbs;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c2;
        this.c2 = c2;
    }

    public boolean cumple(ComponenteWbs c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
