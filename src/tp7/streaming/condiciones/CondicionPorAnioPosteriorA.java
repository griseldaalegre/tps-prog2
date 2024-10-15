package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

import java.time.LocalDate;

public class CondicionPorAnioPosteriorA {
    private LocalDate anio;

    public CondicionPorAnioPosteriorA(LocalDate anio) {
        this.anio = anio;
    }

    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno().isAfter(this.anio);
    }
}
