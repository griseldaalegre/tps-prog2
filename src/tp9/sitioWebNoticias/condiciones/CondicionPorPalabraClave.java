package tp9.sitioWebNoticias.condiciones;

import tp9.sitioWebNoticias.Noticia;

public class CondicionPorPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPorPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean cumple(Noticia n) {
        return n.tienePalabraClave(palabraClave);
    }
}
