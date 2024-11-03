package practicaParcial.parciales2021.hotelera;

import practicaParcial.parciales2021.hotelera.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoHotel {

    public abstract ArrayList<Habitacion> buscarHabitacionesDisponibles(Condicion c);


    public abstract int getCantidadDeHabitacionesPorCondicion(Condicion c);

    public abstract int getCantidadTotalHabitacionesLibres();

    public abstract double getTotalDimension();
}
