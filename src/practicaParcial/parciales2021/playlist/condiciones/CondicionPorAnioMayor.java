package practicaParcial.parciales2021.playlist.condiciones;

import practicaParcial.parciales2021.playlist.Video;

import java.time.LocalDate;

public class CondicionPorAnioMayor extends Condicion {
    private LocalDate anio;

    public CondicionPorAnioMayor(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getAnioPublicacion().isAfter(anio);
    }
}
