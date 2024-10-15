package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionPorDirector extends Condicion {
    private String director;

    public CondicionPorDirector(String director) {
        this.director = director;
    }

    public boolean cumple(Pelicula p) {
        return p.getDirector().equals(this.director);
    }
}
