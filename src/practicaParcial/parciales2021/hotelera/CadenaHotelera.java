package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CadenaHotelera {
    private ArrayList<ElementoHotel> elementos;
    private Comparator orden;

    public CadenaHotelera(Comparator<Habitacion> orden) {
        this.elementos = new ArrayList<>();
        this.orden = orden;
    }

    public ArrayList<Habitacion> buscarHabitacionesDisponibles(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        for (ElementoHotel elemento : elementos) {
            resultado.addAll(elemento.buscarHabitacionesDisponibles(c));
        }
        Collections.sort(resultado, orden);
        return resultado;
    }

    public int buscarCantidadPorCondicion(Condicion c) {
        int resultado = 0;
        for (ElementoHotel elemento : elementos) {
            resultado += elemento.getCantidadDeHabitacionesPorCondicion(c);
        }
        return resultado;
    }

    public int getCantidadTotalHabitacionesLibres() {
        int resultado = 0;
        for (ElementoHotel elemento : elementos) {
            resultado += elemento.getCantidadTotalHabitacionesLibres();
        }
        return resultado;
    }

}
