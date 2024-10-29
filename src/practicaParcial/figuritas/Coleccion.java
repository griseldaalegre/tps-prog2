package practicaParcial.figuritas;

import java.util.ArrayList;
import java.util.Collections;

import practicaParcial.figuritas.condiciones.Condicion;


public class Coleccion extends ComponenteFigurita {
    protected ArrayList<ComponenteFigurita> elementos;
    private double descuento;

    public Coleccion(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ComponenteFigurita elemento) {
        this.elementos.add(elemento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        double resultado = 0;
        for (ComponenteFigurita elemento : elementos) {
            resultado += elemento.getPrecio();
        }
        return resultado - resultado * descuento / 100;
    }

    public ArrayList<Figurita> buscar(Condicion c) {
        ArrayList<Figurita> resultado = new ArrayList<>();
        for (ComponenteFigurita elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        Collections.sort(resultado); //implementar comparable en figuritas
        return resultado;
    }
}
