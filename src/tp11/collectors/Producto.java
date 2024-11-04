package tp11.collectors;

import tp11.collectors.condiciones.Condicion;

import java.util.ArrayList;

public class Producto extends ComponenteColeccion {
    private double peso;
    private double volumen;
    private ArrayList<String> caracteristicas;


    public Producto(String nombre, double peso, int volumen) {
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    //VER SI IRIA EN LA ABSTRACTA
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int getCantidadColeccionables() {
        return 1;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(this.caracteristicas);
    }

    public void addCaracteristica(String c) {
        if (!this.caracteristicas.contains(c)) {
            this.caracteristicas.add(c);
        }
    }

    @Override
    public ArrayList<Producto> buscar(Condicion c) {
        ArrayList<Producto> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

}
