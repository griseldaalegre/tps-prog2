package practicaParcial.parcial2210;

import java.util.ArrayList;

import practicaParcial.parcial2210.condiciones.Condicion;

public class Grupo extends ComponenteVenta {
    private ArrayList<ComponenteVenta> elementos;

    public Grupo() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getGanancias() {
        double resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.getGanancias();
        }
        return resultado;
    }

    @Override
    public ArrayList<Vendedor> buscar(Condicion c) {
        ArrayList<Vendedor> resultado = new ArrayList<>();
        for (ComponenteVenta elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }

    public int cantidadProductosVendidos() {
        int resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.cantidadProductosVendidos();
        }
        return resultado;
    }

    public int cantidadVentasTotales() {
        int resultado = 0;
        for (ComponenteVenta elemento : elementos) {
            resultado += elemento.cantidadVentasTotales();
        }
        return resultado;
    }

    @Override
    public int getPromedioEdad() {
        if (elementos.isEmpty()) {
            return 0; // O cualquier valor que represente que no hay elementos
        }
        int totalPersonas = 0;
        int totalEdades = 0;
        for (ComponenteVenta elemento : elementos) {
            totalEdades += elemento.getPromedioEdad();
            totalPersonas += elemento.getCantidadPersonas(); // Método que devuelve la cantidad de personas en cada ComponenteVenta

        }
        return totalEdades / totalPersonas;//revisar
    }

    @Override
    public int getCantidadPersonas() {
        int totalPersonas = 0;
        for (ComponenteVenta elemento : elementos) {
            totalPersonas += elemento.getCantidadPersonas(); // Método que devuelve la cantidad de personas en cada ComponenteVenta
        }
        return totalPersonas;
    }
}
