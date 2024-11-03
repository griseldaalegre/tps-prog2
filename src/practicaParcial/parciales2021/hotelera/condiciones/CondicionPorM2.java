package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorM2 extends Condicion{
    private double m2;

    public CondicionPorM2(double m2) {
        this.m2 = m2;
    }


    @Override
    public boolean cumple(Habitacion h) {
        return h.getTotalDimension() > m2;
    }
}
