package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

public class CondicionAnd extends Condicion {

    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Articulo a) {
        return c1.cumple(a) && c2.cumple(a);
    }
}
