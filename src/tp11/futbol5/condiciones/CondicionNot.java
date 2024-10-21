package tp11.futbol5.condiciones;

import tp11.futbol5.Socio;

public class CondicionNot extends Condicion {
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Socio s) {
        return !c1.cumple(s);
    }
}

