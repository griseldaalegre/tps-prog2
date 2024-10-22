package practicaParcial.recuperatorio2023;

import practicaParcial.recuperatorio2023.condiciones.Condicion;

public class EspecializacionPremium extends Especializacion {

    public EspecializacionPremium(String nombre, int descuento, Condicion condicion) {
        super(nombre, descuento, condicion);
    }

    @Override
    public double getPrecio() {
        return this.getPrecio();
    }
}
