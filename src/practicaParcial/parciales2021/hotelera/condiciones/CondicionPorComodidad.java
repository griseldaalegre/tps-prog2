package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorComodidad extends Condicion {
    private String comodidad;

    public CondicionPorComodidad(String comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public boolean cumple(Habitacion h) {
        return h.tieneComodidad(comodidad);
    }
}
