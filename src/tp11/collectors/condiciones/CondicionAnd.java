package tp11.collectors.condiciones;

import tp11.collectors.ComponenteColeccion;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ComponenteColeccion c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
