package clases.sistemaArchivosComparadores.comparadores;

import sistemaArchivos.ElementoSA;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElementoSA> {
    @Override
    public int compare(ElementoSA o1, ElementoSA o2) {
        return Double.compare(o1.getTamanio(), o2.getTamanio());
    }
}
