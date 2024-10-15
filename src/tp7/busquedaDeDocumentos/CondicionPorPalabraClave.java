package tp7.busquedaDeDocumentos;

public class CondicionPorPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPorPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave.toUpperCase();
    }

    public boolean cumple(Documento d) {
        return d.tienePalabraClave(palabraClave);
    }
}
