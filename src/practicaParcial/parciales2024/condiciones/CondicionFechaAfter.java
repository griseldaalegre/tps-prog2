package practicaParcial.parciales2024.condiciones;

import practicaParcial.parciales2024.Vendedor;

import java.time.LocalDate;

public class CondicionFechaAfter extends Condicion {
    private LocalDate fecha1;
    private LocalDate fecha2;

    public CondicionFechaAfter(LocalDate fecha1, LocalDate fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;

    }

    @Override
    public boolean cumple(Vendedor v) {
        return v.vendisteAlgo(fecha1, fecha2);

    }
}