package practicaParcial.parciales2021.hotelera.comparadores;

import practicaParcial.parciales2021.hotelera.Habitacion;

import java.util.Comparator;

public class ComparadorPorM2 implements Comparator<Habitacion> {
    public int compare(Habitacion o1, Habitacion o2) {
        double resultado = o1.getMetros() - o2.getMetros();
        if (resultado > 1) {
            return 1;
        } else if (resultado < 1) {
            return -1;
        } else {
            return 0;
        }
    }
}
