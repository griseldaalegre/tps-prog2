package practicaParcial.parciales2021.libreria;

import practicaParcial.parciales2021.libreria.condiciones.Condicion;

import java.util.ArrayList;

public class Kit extends ComponenteLibreria {
    private ArrayList<ComponenteLibreria> elementos;

    public Kit(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ComponenteLibreria elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public String getMarca() {
        return elementos.getFirst().getMarca();
    }

    @Override
    public double getPrecio() {
        double resultado = 0;
        for (ComponenteLibreria elemento : elementos) {
            resultado += elemento.getPrecio();
        }
        return resultado;
    }

    //el mayor volumen
    @Override
    public int getVolumen() {
        int resultadoMayor = 0;
        for (ComponenteLibreria elemento : elementos) {
            if (elemento.getVolumen() > resultadoMayor) {
                resultadoMayor = elemento.getVolumen();
            }
        }
        return resultadoMayor;
    }

    @Override
    public int getCantidadProductos() {
        int resultado = 0;
        for (ComponenteLibreria elemento : elementos) {
            resultado += elemento.getCantidadProductos();
        }
        return resultado;
    }

    @Override
    public ArrayList<ComponenteLibreria> buscar(Condicion c) {
        ArrayList<ComponenteLibreria> resultado = new ArrayList<>();
        for (ComponenteLibreria elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }

    @Override
    public boolean puedePublicitarse(Condicion c) {
        for (ComponenteLibreria elemento : elementos) {
            if (!elemento.puedePublicitarse(c)) {
                return false; // Si un elemento no cumple, el kit no puede publicitarse
            }
        }
        return true; // Todos los elementos cumplen, el kit puede publicitarse
    }
}
