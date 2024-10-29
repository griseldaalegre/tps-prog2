package practicaParcial.parciales2021.hotelera.condiciones;

import practicaParcial.parciales2021.hotelera.Habitacion;

public class CondicionPorMascotas extends Condicion{

    public boolean cumple(Habitacion h){
        return h.isAceptaMascotas();
    }
}
