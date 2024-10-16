package clases.compositeMultinacionalBusquedas.condiciones;

import clases.compositeMultinacionalBusquedas.Empleado;

public class CondicionNot extends Condicion {
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Empleado e) {
        return !c.cumple(e);
    }
}
