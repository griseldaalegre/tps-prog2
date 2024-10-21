package tp9.sitioWebNoticias.condiciones;

import tp9.sitioWebNoticias.Noticia;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(this.titulo);
    }
}
