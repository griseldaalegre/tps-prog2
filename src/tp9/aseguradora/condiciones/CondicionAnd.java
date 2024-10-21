package tp9.aseguradora.condiciones;

import tp9.aseguradora.ComponenteSeguro;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(ComponenteSeguro seguro) {
        return c1.cumple(seguro) && c2.cumple(seguro);
    }

}
