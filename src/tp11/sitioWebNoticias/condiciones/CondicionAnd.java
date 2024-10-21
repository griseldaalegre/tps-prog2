package tp11.sitioWebNoticias.condiciones;

import tp11.sitioWebNoticias.Noticia;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return this.c2.cumple(n) && this.cumple(n);
    }
}
