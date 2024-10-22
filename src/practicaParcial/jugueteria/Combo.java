package practicaParcial.jugueteria;

import practicaParcial.jugueteria.condiciones.Condicion;

import java.util.ArrayList;

public class Combo extends ComponenteJuego {
    private double descuento;
    protected ArrayList<ComponenteJuego> elementos;

    public Combo(String marca, double descuento) {
        super(marca);
        this.descuento = descuento;
        this.elementos = new ArrayList<>();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void addElemento(ComponenteJuego elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public double getPeso() {
        double resultado = 0;
        for (ComponenteJuego elemento : elementos) {
            resultado += elemento.getPeso();
        }
        return resultado;
    }

    @Override
    public double getCosto() {
        double resultado = 0;
        for (ComponenteJuego elemento : elementos) {
            resultado += elemento.getPeso();//recorro cada elemento hijo
        }
        return resultado * getDescuento();
    }

    @Override
    public String getColor() {
        return this.elementos.get(this.elementos.size() - 1).getColor(); // Obtiene el color del último elemento
    }

    @Override
    public int getCantidadEncastres() {
        int resultado = 0;
        for (ComponenteJuego elemento : elementos) {
            resultado += elemento.getCantidadEncastres();
        }
        return resultado;
    }

    @Override
    public ArrayList<ComponenteJuego> buscar(Condicion condicion) {
        ArrayList<ComponenteJuego> resultado = new ArrayList<>();
        for (ComponenteJuego elemento : elementos) {
            resultado.addAll(elemento.buscar(condicion));
        }
        return resultado;
    }

}
