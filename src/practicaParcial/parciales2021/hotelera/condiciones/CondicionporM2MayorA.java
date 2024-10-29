package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionporM2MayorA extends Condicion {
    private double m2;

    public CondicionporM2MayorA(double m2) {
        this.m2 = m2;
    }

    public boolean cumple(Habitacion h) {
        return h.getMetros() > this.m2;
    }
}
