package practicaParcial.jugueteria.condiciones;

import practicaParcial.jugueteria.ComponenteJuego;

public class CondicionPorEncastres extends Condicion {
    private int encastre;

    public CondicionPorEncastres(int encastre) {
        this.encastre = encastre;
    }

    @Override
    public boolean cumple(ComponenteJuego c) {
        return c.getCantidadEncastres() < this.encastre;
    }
}
