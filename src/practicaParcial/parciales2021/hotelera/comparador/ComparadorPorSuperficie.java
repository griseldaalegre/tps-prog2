package practicaParcial.parciales2021.hotelera.comparador;

import practicaParcial.parciales2021.hotelera.Habitacion;

import java.util.Comparator;

public class ComparadorPorSuperficie implements Comparator<Habitacion> {
    public int compare(Habitacion h1, Habitacion h2) {
        return Double.compare(h1.getTotalDimension(), h2.getTotalDimension());
    }
}
