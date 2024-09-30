package tp7.ejercicio2;

public class CondicionNot extends Condicion {
    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    public boolean cumple(Documento d) {
        return !c.cumple(d);
    }
}
