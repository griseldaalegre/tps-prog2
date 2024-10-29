package practicaParcial.parcial2210.condiciones;

import practicaParcial.parcial2210.Vendedor;

import java.time.LocalDate;

public class CondicionFechaAfter extends Condicion {
    private LocalDate fecha;

    public CondicionFechaAfter(LocalDate fecha) {
        this.fecha = fecha;

    }

    @Override
    public boolean cumple(Vendedor v) {
        return v.buscarFechaVentaAfter(fecha);

    }
}