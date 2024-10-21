package tp11.wbs.condiciones;

import tp11.wbs.ComponenteWbs;

public class CondicionPorEstado extends Condicion {
    private String estado;

    public CondicionPorEstado(String estado) {
        this.estado = estado;
    }

    public boolean cumple(ComponenteWbs c) {
        return c.tieneEstado(estado);
    }
}
