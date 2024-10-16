package clases.sistemaArchivosComparator.condiciones;

import clases.sistemaArchivosComparator.Archivo;

public abstract class Condicion {
    public abstract boolean cumple(Archivo a);
}
