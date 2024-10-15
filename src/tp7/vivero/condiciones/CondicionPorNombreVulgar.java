package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorNombreVulgar extends Condicion {
    public String nombre;

    public CondicionPorNombreVulgar(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Planta p) {
        return p.tieneNombreVulgar(this.nombre);
    }
}
