package practicaParcial.parciales2021.hotelera.comparador;

import practicaParcial.parciales2021.hotelera.Habitacion;

import java.util.Comparator;

public class ComparadorPorCamas implements Comparator<Habitacion> {
    public int compare(Habitacion h1, Habitacion h2) {
        return h1.getCantidadCamas() - h2.getCantidadCamas();
    }
}
