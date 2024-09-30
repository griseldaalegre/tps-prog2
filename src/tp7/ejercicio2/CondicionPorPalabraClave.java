package tp7.ejercicio2;

public class CondicionPorPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPorPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave.toUpperCase();
    }

    public boolean cumple(Documento d) {
        return d.tienePalabraClave(palabraClave);
    }
}
