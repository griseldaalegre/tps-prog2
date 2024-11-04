package tp11.collectors;


import tp11.collectors.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ComponenteColeccion {
    private String nombre;
    private static double costoIndividual = 1;
    private static double precioGramo = 10;

    public ComponenteColeccion(String nombre) {
        this.nombre = nombre;
    }

    public static double getCostoIndividual() {
        return costoIndividual;
    }

    public static void setCostoIndividual(double costoIndividual) {
        ComponenteColeccion.costoIndividual = costoIndividual;
    }

    public static double getPrecioGramo() {
        return precioGramo;
    }

    public static void setPrecioGramo(double precioGramo) {
        ComponenteColeccion.precioGramo = precioGramo;
    }

    public abstract double getPeso();

    public abstract int getCantidadColeccionables();

    public abstract double getVolumen();

    public abstract ArrayList<String> getCaracteristicas();

    public double getCosto() {
        return this.getCantidadColeccionables() * ComponenteColeccion.getCostoIndividual() + ComponenteColeccion.getPrecioGramo();
    }

    public abstract ArrayList<Producto> buscar(Condicion c);
}