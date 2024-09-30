package clases.farmacia;

public class CondicionOr {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Medicamento m) {
        return c1.cumple(m) || c2.cumple(m);
    }
}
