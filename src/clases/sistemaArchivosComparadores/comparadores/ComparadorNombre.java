package clases.sistemaArchivosComparadores.comparadores;

import sistemaArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSA> {
    @Override
    public int compare(ElementoSA o1, ElementoSA o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
