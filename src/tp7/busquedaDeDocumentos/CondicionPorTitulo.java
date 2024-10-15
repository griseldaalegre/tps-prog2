package tp7.busquedaDeDocumentos;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumple(Documento documento) {
        return titulo.equalsIgnoreCase(documento.getTitulo());    }
}
