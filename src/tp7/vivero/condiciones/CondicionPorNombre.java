package tp7.vivero.condiciones;

import tp7.vivero.Planta;

public class CondicionPorNombre extends Condicion {
    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(this.nombre);
    }
}
