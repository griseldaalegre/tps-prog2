package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorHabitacionLibre extends Condicion{
    private boolean libre;

    @Override
    public boolean cumple(Habitacion h) {
        return h.isLibre();
    }
}
