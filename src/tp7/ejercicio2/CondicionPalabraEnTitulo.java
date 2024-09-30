package tp7.ejercicio2;

public class CondicionPalabraEnTitulo extends Condicion {
    private String titulo;

    public CondicionPalabraEnTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public boolean cumple(Documento documento) {
        return titulo.equalsIgnoreCase(documento.getTitulo());    }

}
