package practicaParcial.figuritas;
import practicaParcial.figuritas.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteFigurita {
    private String nombre;

    public ComponenteFigurita(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();

    public abstract ArrayList<Figurita> buscar(Condicion c);
}
