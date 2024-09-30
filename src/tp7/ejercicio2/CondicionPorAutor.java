package tp7.ejercicio2;

public class CondicionPorAutor extends Condicion {
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor.toUpperCase();
    }

    public boolean cumple(Documento d) {
        return d.tieneAutor(autor);
    }
}