package practicaParcial.parciales2021.hotelera.comparador;

import practicaParcial.parciales2021.hotelera.Habitacion;

import java.util.Comparator;

public class ComparadorPorFechas implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion h1, Habitacion h2) {
        return h1.getUltimaFechaDeOcupacion().compareTo(h2.getUltimaFechaDeOcupacion());
    }
}
