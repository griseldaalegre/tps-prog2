package practicaParcial.jugueteria;
import practicaParcial.jugueteria.condiciones.Condicion;

import java.util.ArrayList;

public class Pieza extends ComponenteJuego {
    private double peso;
    private double costo;
    private String color;
    private int CantidadPiezas;

    public Pieza(String marca, double peso, double costo, String color, int cantidadPiezas) {
        super(marca);
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        CantidadPiezas = cantidadPiezas;
    }


    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCantidadEncastres() {
        return 1;
    }


    public ArrayList<ComponenteJuego> buscar(Condicion condicion) {
        ArrayList<ComponenteJuego> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}
