package practicaParcial.jugueteria.condiciones;

import practicaParcial.jugueteria.ComponenteJuego;

public class CondicionOr extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(ComponenteJuego c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}