package practicaParcial.Recuperatorio211111;


import practicaParcial.Recuperatorio211111.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoProducto {
    public abstract double getPrecio();//resolver lo del descuento

    public abstract double getPeso();


    public abstract int getCantidadProductos();

    public abstract ArrayList<ElementoProducto> buscar(Condicion c);

    public abstract ArrayList<String> getCategorias();

    public abstract ElementoProducto copiaRestringida(Condicion c);

    public abstract boolean tieneCategoria(String s);

    public abstract Producto getProductoMenorPeso();
    //va en el bazar
}
