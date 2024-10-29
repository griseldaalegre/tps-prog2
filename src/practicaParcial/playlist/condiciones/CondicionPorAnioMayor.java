package practicaParcial.playlist.condiciones;

import practicaParcial.playlist.ComponentePlaylist;
import practicaParcial.playlist.Video;

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
