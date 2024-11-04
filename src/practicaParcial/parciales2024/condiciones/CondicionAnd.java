package practicaParcial.parciales2024.condiciones;

import practicaParcial.parciales2024.Vendedor;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Vendedor v) {
        return c1.cumple(v) && c2.cumple(v);
    }
}

