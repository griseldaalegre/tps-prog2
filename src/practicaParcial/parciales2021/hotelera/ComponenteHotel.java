package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ComponenteHotel {


    public abstract int getCantidadHabitacionesQueTienen(Condicion c);

    public abstract ArrayList<Habitacion> buscar(Condicion c);

    public ArrayList<Habitacion> buscar(Condicion c, Comparator<Habitacion> orden) {
        ArrayList<Habitacion> resultado = this.buscar(c);
        Collections.sort(resultado, orden);
        return resultado;
    }
}
