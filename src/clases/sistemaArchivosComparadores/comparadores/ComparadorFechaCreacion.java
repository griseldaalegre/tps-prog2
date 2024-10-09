package clases.sistemaArchivosComparadores.comparadores;

import sistemaArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorFechaCreacion implements Comparator<ElementoSA>{
    @Override
    public int compare(ElementoSA o1, ElementoSA o2) {
        return o1.getfCreacion().compareTo(o2.getfCreacion());
    }
}
