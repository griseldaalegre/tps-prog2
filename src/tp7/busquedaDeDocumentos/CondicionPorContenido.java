package tp7.busquedaDeDocumentos;

public class CondicionPorContenido extends Condicion {
    private String contenido;

    public CondicionPorContenido(String contenido) {
        this.contenido = contenido.toUpperCase();
    }

    public boolean cumple(Documento d) {
        return d.tieneContenido(contenido);
    }
}
