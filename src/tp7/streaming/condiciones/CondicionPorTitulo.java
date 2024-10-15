package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Pelicula p) {
        return p.getTitulo().contains(this.titulo);
    }
}
