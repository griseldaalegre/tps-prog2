package practicaParcial.parciales2021.libreria;

import practicaParcial.parciales2021.libreria.condiciones.Condicion;

import java.util.ArrayList;

public class Producto extends ComponenteLibreria {
    private String marca;
    private double precio;
    private int volumen;

    public Producto(String nombre, String marca, double precio, int volumen) {
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public int getCantidadProductos() {
        return 1;
    }

    @Override
    public ArrayList<ComponenteLibreria> buscar(Condicion c) {
        ArrayList<ComponenteLibreria> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public boolean puedePublicitarse(Condicion c) {
        return c.cumple(this);
    }
}
