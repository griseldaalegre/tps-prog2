package practicaParcial.parciales2024.jugueteria.condiciones;

import practicaParcial.parciales2024.jugueteria.ComponenteJuego;

public class CondicionPorColor extends Condicion {
    private String color;

    public CondicionPorColor(String color) {
        this.color = color;
    }

    @Override
    public boolean cumple(ComponenteJuego c) {
        return c.getColor().equals(color);
    }
}
