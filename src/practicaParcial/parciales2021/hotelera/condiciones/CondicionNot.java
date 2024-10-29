package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionNot extends Condicion {
    private Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }


    @Override
    public boolean cumple(Habitacion h) {
        return !c1.cumple(h);
    }
}
