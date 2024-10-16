package clases.sistemaArchivosComparator.condiciones;

import clases.sistemaArchivosComparator.Archivo;

public class CondAnd extends Condicion{
    Condicion c1, c2;

    public CondAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Archivo a) {
        return c1.cumple(a) && c2.cumple(a);
    }
}
