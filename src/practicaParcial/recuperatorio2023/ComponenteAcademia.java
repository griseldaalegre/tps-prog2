package practicaParcial.recuperatorio2023;

import practicaParcial.recuperatorio2023.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteAcademia {
    private String nombre;

    public ComponenteAcademia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();

    public abstract int cantidadCursos();

    public abstract int cantidadHoras();

    public abstract ArrayList<String> getDocentes();

    public abstract ArrayList<String> getPalabras();

    public boolean contienePalabra(String palabra) {
        return this.getPalabras().contains(palabra);
    }

    public abstract ArrayList<Curso> buscar(Condicion c);

    public abstract Curso cursoMasCaro();

}
