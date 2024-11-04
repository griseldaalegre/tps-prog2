package practicaParcial.parciales2024.jugueteria.condiciones;

import practicaParcial.parciales2024.jugueteria.ComponenteJuego;

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
