package practicaParcial.presupuesto.condiciones;


import practicaParcial.presupuesto.ComponentePresupuesto;

public class CondicionNot extends Condicion {
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return !c1.cumple(c);
    }
}
