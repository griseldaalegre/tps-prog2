package tp7.ejercicio2;

public class CondicionAnd extends Condicion {
    //RECIBO 2 CONDICIONES
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Documento d) {
        //si ambas c cumplen
        return c1.cumple(d) && c2.cumple(d);
    }

}
