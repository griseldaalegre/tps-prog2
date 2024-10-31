package practicaParcial.fotografias.condiciones;

import practicaParcial.fotografias.Fotogafia;

import java.time.LocalDate;

public class CondicionPorFecha extends Condicion {
    private LocalDate fecha;

    public CondicionPorFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Fotogafia f) {
        return f.getFecha().isAfter(this.fecha);
    }
}
