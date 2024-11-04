package practicaParcial.parciales2024.jugueteria;

import practicaParcial.parciales2024.jugueteria.condiciones.Condicion;

public class ComboEspecial extends Combo {
    private Condicion condicion;


    public ComboEspecial(String marca, double descuento, Condicion condicion) {
        super(marca, descuento);
        this.condicion = condicion;
    }

    @Override
    public void addElemento(ComponenteJuego elemento) {
        if (condicion.cumple(elemento)) {
            super.addElemento(elemento);
        }
    }

}
