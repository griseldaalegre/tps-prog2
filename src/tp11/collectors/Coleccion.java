package tp11.collectors;

import tp11.collectors.condiciones.Condicion;

import java.util.ArrayList;

public class Coleccion extends ComponenteColeccion {
    protected ArrayList<ComponenteColeccion> coleccion;
    private double extra = 0.1;

    public Coleccion(String nombre) {
        super(nombre);

        this.coleccion = new ArrayList<ComponenteColeccion>();
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public void addElemento(ComponenteColeccion c) {
        this.coleccion.add(c);
    }

    @Override
    public double getPeso() {
        double peso = 0.0;
        for (ComponenteColeccion elemento : coleccion) {
            peso += elemento.getPeso();
        }
        return peso;
    }

    @Override
    public int getCantidadColeccionables() {
        int resultado = 0;
        for (ComponenteColeccion elemento : coleccion) {
            resultado += elemento.getCantidadColeccionables();
        }
        return resultado;
    }

    @Override
    public double getVolumen() {
        double resultado = 0.0;
        for (ComponenteColeccion c : coleccion) {
            resultado += c.getVolumen();//revisar
        }
        return resultado + getExtra() * getCantidadColeccionables();
    }


    @Override
    public ArrayList<String> getCaracteristicas() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ComponenteColeccion elemento : coleccion) {
            ArrayList<String> elementosHijos = elemento.getCaracteristicas();
            for (String elem : elementosHijos) {
                if (!resultado.contains(elem)) {
                    resultado.add(elem);
                }
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<Producto> buscar(Condicion c) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (ComponenteColeccion elemento : coleccion) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }


}
