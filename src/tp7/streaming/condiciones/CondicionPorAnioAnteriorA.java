package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

import java.time.LocalDate;

public class CondicionPorAnioAnteriorA extends Condicion {
    private LocalDate anio;

    public CondicionPorAnioAnteriorA(LocalDate anio) {
        this.anio = anio;
    }

    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno().isBefore(this.anio);
    }
}
