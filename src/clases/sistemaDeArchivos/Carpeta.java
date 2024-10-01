package clases.sistemaDeArchivos;

import clases.sistemaDeArchivos.condiciones.Condicion;

import java.util.ArrayList;

public class Carpeta extends ElementoSA {
    private ArrayList<ElementoSA> contenido;

    public Carpeta(String nombre) {
        super(nombre);
        this.contenido = new ArrayList<ElementoSA>();
    }

    public void addContenido(ElementoSA c) {
        contenido.add(c);
        this.setFechaUltimaModificacion();
    }

    public double getTamanio() {
        double total = 0;
        for (int i = 0; i < this.contenido.size(); i++) {
            total += this.contenido.get(i).getTamanio();
        }
        return total;
    }

    public int getCantidadElementos() {
        int total = 1;//Arranco en 1 para q la carpeta tambienn se sume
        for (int i = 0; i < this.contenido.size(); i++) {
            total += this.contenido.get(i).getCantidadElementos();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carpeta{" + getNombre() + "  " +
                "contenido=" + contenido +
                '}';
    }

    public ArrayList<Archivo> buscar(Condicion c) {
        ArrayList<Archivo> resultado = new ArrayList<Archivo>();
        for (ElementoSA elem : contenido) {
            resultado.addAll(elem.buscar(c));//el hijo busca
            //el add agrega de a un elemento
            //addAll agrega cada uno de los eleementos dde la lista que recibe como a la lista resultado
        }
        return resultado;
    }

}
