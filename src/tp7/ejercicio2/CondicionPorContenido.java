package tp7.ejercicio2;

public class CondicionPorContenido extends Condicion {
    private String contenido;

    public CondicionPorContenido(String contenido) {
        this.contenido = contenido.toUpperCase();
    }

    public boolean cumple(Documento d) {
        return d.tieneContenido(contenido);
    }
}
