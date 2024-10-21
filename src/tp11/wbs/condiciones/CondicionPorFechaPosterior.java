package tp11.wbs.condiciones;

import tp11.wbs.ComponenteWbs;

import java.time.LocalDate;

public class CondicionPorFechaPosterior extends Condicion {
    private LocalDate fecha;

    CondicionPorFechaPosterior(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean cumple(ComponenteWbs c) {
        return c.getFechaFin().isAfter(fecha);
    }
}
