package practicaParcial.presupuesto.condiciones;

import practicaParcial.presupuesto.ComponentePresupuesto;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
