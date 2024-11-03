package practicaParcial.Recuperatorio211111;

import practicaParcial.Recuperatorio211111.condiciones.Condicion;

import java.util.ArrayList;

public class Producto extends ElementoProducto {
    private double precio;
    private double peso;
    private ArrayList<String> categorias;

    public Producto(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.categorias = new ArrayList<>();
    }


    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void addCategoria(String categoria) {
        if (!this.categorias.contains(categoria)) {
            this.categorias.add(categoria);
        }
    }

    @Override
    public int getCantidadProductos() {
        return 1;
    }

    @Override
    public ArrayList<ElementoProducto> buscar(Condicion c) {
        ArrayList<ElementoProducto> resultado = new ArrayList<>();
        if (c.cumple(this)) { //si cumplo me agrego
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(this.categorias);//devuelvo copia copia
    }

    @Override
    public ElementoProducto copiaRestringida(Condicion c) {
        //si cumplo la condicion
        if (c.cumple(this)) {
            return crearProducto();
        }
        return null;
    }

    private Producto crearProducto() {
        Producto copia = new Producto(this.getPrecio(), this.getPeso());
        for (String categoria : categorias) {
            copia.addCategoria(categoria);
        }
        return copia;
    }

    public boolean tieneCategoria(String catetgoria) {
        return this.categorias.contains(catetgoria);
    }

    @Override
    public Producto getProductoMenorPeso() {
        return crearProducto();
    }

}
