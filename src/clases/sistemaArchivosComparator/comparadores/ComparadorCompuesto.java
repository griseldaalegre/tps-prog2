package clases.sistemaArchivosComparator.comparadores;

import clases.sistemaArchivosComparator.ElementoSA;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoSA> {
    Comparator<ElementoSA> criterio1, criterio2;

    public ComparadorCompuesto(Comparator<ElementoSA> criterio1, Comparator<ElementoSA> criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public int compare(ElementoSA o1, ElementoSA o2) {
        int resultado = criterio1.compare(o1, o2);
        if (resultado == 0)
            return criterio2.compare(o1,o2);
        return resultado;
    }
}
