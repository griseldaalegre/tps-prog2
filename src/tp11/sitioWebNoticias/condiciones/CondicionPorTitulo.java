package tp11.sitioWebNoticias.condiciones;

import tp11.sitioWebNoticias.Noticia;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(this.titulo);
    }
}
