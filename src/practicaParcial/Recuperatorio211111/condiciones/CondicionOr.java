package practicaParcial.Recuperatorio211111.condiciones;

import practicaParcial.Recuperatorio211111.ElementoProducto;

public class CondicionOr extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(ElementoProducto e) {
        return c1.cumple(e) || c2.cumple(e);
    }
}
