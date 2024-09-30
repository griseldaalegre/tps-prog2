package tp7.ejercicio2;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        return titulo.equalsIgnoreCase(documento.getTitulo());    }
}
