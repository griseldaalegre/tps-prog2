package clases.compositeMultinacionalBusquedas.condiciones;

import clases.compositeMultinacionalBusquedas.Empleado;

public class CondicionOr extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(Empleado e) {
        return c1.cumple(e) || c2.cumple(e);
    }
}
