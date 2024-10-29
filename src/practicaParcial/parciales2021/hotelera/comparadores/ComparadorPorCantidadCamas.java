package practicaParcial.parciales2021.hotelera.comparadores;

import practicaParcial.parciales2021.hotelera.Habitacion;

import java.util.Comparator;

public class ComparadorPorCantidadCamas implements Comparator<Habitacion> {
    public int compare(Habitacion o1, Habitacion o2) {
        return o1.getCantidadCamas() - o2.getCantidadCamas();
    }
}
