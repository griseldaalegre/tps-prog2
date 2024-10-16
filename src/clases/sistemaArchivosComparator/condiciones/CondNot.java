package clases.sistemaArchivosComparator.condiciones;

import clases.sistemaArchivosComparator.Archivo;

public class CondNot extends Condicion{
    Condicion directa;

    public CondNot(Condicion directa) {
        this.directa = directa;
    }

    @Override
    public boolean cumple(Archivo a) {
        return !directa.cumple(a);
    }
}
