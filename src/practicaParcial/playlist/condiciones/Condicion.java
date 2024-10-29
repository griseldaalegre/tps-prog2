package practicaParcial.playlist.condiciones;

import practicaParcial.playlist.ComponentePlaylist;
import practicaParcial.playlist.Video;

public abstract class Condicion {
    public abstract boolean cumple(Video v);
}
