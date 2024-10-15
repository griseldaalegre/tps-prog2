package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionNot extends Condicion {
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    public boolean cumple(Pelicula p) {
        return !c.cumple(p); //niego mi condicion
    }
}
