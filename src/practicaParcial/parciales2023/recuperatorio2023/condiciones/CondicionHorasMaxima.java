package practicaParcial.parciales2023.recuperatorio2023.condiciones;

import practicaParcial.parciales2023.recuperatorio2023.ComponenteAcademia;

public class CondicionHorasMaxima extends Condicion {
    private int horas;

    public CondicionHorasMaxima(int horas) {
        this.horas = horas;
    }

    @Override
    public boolean cumple(ComponenteAcademia c) {
        return c.cantidadHoras() < horas;
    }
}
