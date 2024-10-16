package clases.sistemaArchivosComparator.condiciones;

import clases.sistemaArchivosComparator.Archivo;

public class CondNombre extends Condicion{
    private String nombreBuscado;

    public CondNombre(String nombre) {
        this.nombreBuscado = nombre;
    }

    @Override
    public boolean cumple(Archivo a) {
        return a.getNombre().equals(nombreBuscado);
    }
}
