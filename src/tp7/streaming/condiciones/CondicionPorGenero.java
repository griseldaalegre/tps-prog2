package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionPorGenero extends Condicion {
    private String genero;

    public CondicionPorGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Pelicula p) {
        return p.tieneGenero(this.genero);
    }
}
