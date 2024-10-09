package parcialitos.empresaDeVentas.condiciones;

import parcialitos.empresaDeVentas.Articulo;

public class CondicionPorNombre extends Condicion {
    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Articulo a) {
        return a.getNombre().contains(nombre);
        //si mi articulo contiene el nombre
    }
}
