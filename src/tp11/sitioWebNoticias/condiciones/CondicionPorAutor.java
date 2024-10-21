package tp11.sitioWebNoticias.condiciones;

import tp11.sitioWebNoticias.Noticia;

public class CondicionPorAutor extends Condicion {
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }

    public boolean cumple(Noticia n) {
        return n.getAutor().equals(this.autor);
    }
}
