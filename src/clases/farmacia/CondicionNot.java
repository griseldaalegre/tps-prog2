package clases.farmacia;

public class CondicionNot {

    private Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;

    }

    public boolean cumple(Medicamento m) {
        return !c.cumple(m);
    }
}
