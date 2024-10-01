package clases.sistemaDeArchivos.condiciones;

import clases.sistemaDeArchivos.Archivo;

public abstract class Condicion {
    public abstract boolean cumple(Archivo a);
}
