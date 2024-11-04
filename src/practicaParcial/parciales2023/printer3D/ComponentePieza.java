package practicaParcial.parciales2023.printer3D;

import practicaParcial.parciales2023.printer3D.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponentePieza {
    private String nombre;
    private String descripcion;

    public ComponentePieza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract ArrayList<String> getListaColores();
    public abstract int calcularTiempoImpresion();

    public abstract int calcularPLANecesario();

    public abstract int calcularCantidadDePiezasSmimples();

    public abstract double calcularCosto();

    public abstract ArrayList<PiezaSimple> buscar(Condicion c);
}
