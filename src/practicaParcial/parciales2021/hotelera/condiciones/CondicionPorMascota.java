package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorMascota extends Condicion {
    private boolean aceptaMascota;

    public CondicionPorMascota(boolean aceptaMascota) {
        this.aceptaMascota = aceptaMascota;
    }


    @Override
    public boolean cumple(Habitacion h) {
        return h.isAceptaMascotas()== aceptaMascota;
    }
}
