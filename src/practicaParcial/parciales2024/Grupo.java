package practicaParcial.parciales2024;

import java.util.ArrayList;

import practicaParcial.parciales2024.condiciones.Condicion;

public class Grupo extends ComponenteVenta {
    protected ArrayList<ComponenteVenta> elementos;

    public Grupo() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ComponenteVenta elemento) {
        this.elementos.add(elemento);
    }

    public int cantidadVentasTotales() {//BIEN
        int resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.cantidadVentasTotales();
        }
        return resultado;
    }


    public int cantidadProductosVendidos() {//BIEN
        int resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.cantidadProductosVendidos();
        }
        return resultado;
    }

    @Override
    public double getGanancias() {//BIEN
        double resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.getGanancias();
        }
        return resultado;
    }

    @Override
    public double getPromedioEdad() {
        if (elementos.isEmpty()) {//BIEN
            return 0; // O cualquier valor que represente que no hay elementos
        }
        double totalEdades = 0;
        for (ComponenteVenta elemento : elementos) {
            totalEdades += elemento.getPromedioEdad();
        }
        return totalEdades / this.elementos.size();
    }


    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado = new ArrayList<>();
        for (ComponenteVenta elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }


}
