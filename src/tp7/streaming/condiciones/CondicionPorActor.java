package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionPorActor extends Condicion {
    private String actor;

    public CondicionPorActor(String actor) {
        this.actor = actor;
    }

    public boolean cumple(Pelicula p) {
        return p.tieneActor(this.actor);
    }
}
