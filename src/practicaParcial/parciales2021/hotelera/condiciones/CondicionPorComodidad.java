package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorComodidad extends Condicion {
    private String buscarComodidad;

    public CondicionPorComodidad(String buscarComodidad) {
        this.buscarComodidad = buscarComodidad;
    }

    public boolean cumple(Habitacion h) {
        return h.tieneComodidad(this.buscarComodidad);
    }
}
