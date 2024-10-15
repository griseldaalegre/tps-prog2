package tp7.busquedaDeDocumentos;

public class CondicionPalabraEnTitulo extends Condicion {
    private String titulo;

    public CondicionPalabraEnTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public boolean cumple(Documento documento) {
        return titulo.equalsIgnoreCase(documento.getTitulo());    }

}
