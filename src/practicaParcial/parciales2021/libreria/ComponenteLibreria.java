package practicaParcial.parciales2021.libreria;

import practicaParcial.parciales2021.libreria.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteLibreria {
    private String nombre;

    public ComponenteLibreria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getMarca();

    public abstract double getPrecio();

    public abstract int getVolumen();

    public abstract int getCantidadProductos();

    public abstract ArrayList<ComponenteLibreria> buscar(Condicion c);

    public abstract boolean puedePublicitarse(Condicion c);
}
