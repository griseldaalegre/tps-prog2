package practicaParcial.parciales2023.printer3D.condiciones;

import practicaParcial.parciales2023.printer3D.PiezaSimple;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(PiezaSimple p) {
        return c1.cumple(p) && c2.cumple(p);
    }
}
