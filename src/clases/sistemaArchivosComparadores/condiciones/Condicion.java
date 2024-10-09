package clases.sistemaArchivosComparadores.condiciones;

import sistemaArchivos.Archivo;

public abstract class Condicion {
    public abstract boolean cumple(Archivo a);
}
