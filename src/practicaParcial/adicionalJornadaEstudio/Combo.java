package practicaParcial.adicionalJornadaEstudio;


import practicaParcial.adicionalJornadaEstudio.condiciones.Condicion;

import java.util.ArrayList;

public class Combo extends ElementoProducto {

    private double descuentoPorProducto;
    private double maxDescuento;
    private ArrayList<ElementoProducto> elementos;
    private Condicion condicion;


    public Combo(double descuentoPorProducto, double maxDescuento) {
        this.descuentoPorProducto = descuentoPorProducto;
        this.maxDescuento = maxDescuento;
        //  this.condicion = condicion;
        this.elementos = new ArrayList<>();
    }

    public double getDescuentoPorProducto() {
        return descuentoPorProducto;
    }

    public void setDescuentoPorProducto(double descuentoPorProducto) {
        this.descuentoPorProducto = descuentoPorProducto;
    }

    public double getMaxDescuento() {
        return maxDescuento;
    }

    public void setMaxDescuento(double maxDescuento) {
        this.maxDescuento = maxDescuento;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public void addElemento(ElementoProducto e) {
        if (condicion.cumple(e)) {
            this.elementos.add(e);
        }
    }


    public double getPrecio() {
        double precioTotal = 0;
        for (ElementoProducto elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        double descuentoTotal = precioTotal * (descuentoPorProducto / 100.0);

        if (descuentoTotal > maxDescuento) {
            descuentoTotal = maxDescuento;
        }

        return precioTotal - descuentoTotal;
    }


    @Override
    public double getPeso() {
        double total = 0;
        for (ElementoProducto elemento : elementos) {
            total += elemento.getPeso();
        }
        return total;
    }


    @Override
    public int getCantidadProductos() {
        int total = 0;
        for (ElementoProducto elemento : elementos) {
            total += elemento.getCantidadProductos();
        }
        return total;
    }

    @Override
    public ArrayList<ElementoProducto> buscar(Condicion c) {
        ArrayList<ElementoProducto> resultado = new ArrayList<>();
        for (ElementoProducto elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> resultado = new ArrayList<>();

        for (ElementoProducto elemento : elementos) {
            ArrayList<String> aux = elemento.getCategorias();
            for (String categoria : aux) {
                if (!resultado.contains(categoria)) {
                    resultado.add(categoria);
                }
            }
        }
        return resultado;
    }

    //esto se hace en caso de q me pida que retorne
    @Override
    public ElementoProducto copiaRestringida(Condicion c) {
        Combo copia = crearCombo();
        boolean agrego = false;
        //ahora recorro mi arreglo de productos y lo agrego
        for (ElementoProducto elemento : elementos) {
            //guardo al hijo en una variable
            ElementoProducto copiaHijo = elemento.copiaRestringida(c);
            //controlo si es null
            if (copiaHijo != null) {
                copia.addElemento(copiaHijo);
                agrego = true;
            }
        }
        if (agrego) {
            return copia;
        }
        return null;
    }


    public Combo crearCombo() {
        return new Combo(this.getDescuentoPorProducto(), this.getMaxDescuento());
    }

    @Override
    public boolean tieneCategoria(String categoria) {
        return this.getCategorias().contains(categoria);//revisar
    }

    @Override
    public Producto getProductoMenorPeso() {
        Producto productoMenorPeso = null;

        for (ElementoProducto elemento : elementos) {
            Producto producto = elemento.getProductoMenorPeso();

            // Si encontramos un producto con menor peso, lo asignamos
            if (producto != null && (productoMenorPeso == null || producto.getPeso() < productoMenorPeso.getPeso())) {
                productoMenorPeso = producto;
            }
        }

        return productoMenorPeso;
    }

}
