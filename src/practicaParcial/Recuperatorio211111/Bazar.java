package practicaParcial.Recuperatorio211111;

import practicaParcial.Recuperatorio211111.condiciones.Condicion;

import java.util.ArrayList;

public class Bazar {
    private String nombre;
    private ArrayList<ElementoProducto> elementos;

    public Bazar(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public int getCantidadProductos(Combo c) {
        return c.getCantidadProductos();
    }

    public void addElemento(ElementoProducto e) {
        this.elementos.add(e);
    }

    public ArrayList<ElementoProducto> buscar(Condicion c) {
        ArrayList<ElementoProducto> resultado = new ArrayList<>();
        for (ElementoProducto elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }

    public Producto getProductoMenorPeso(Combo c) {
        return c.getProductoMenorPeso();
    }

    public ElementoProducto getCopia(ElementoProducto elementoProducto, Condicion c) {
        return elementoProducto.copiaRestringida(c);
    }

}
