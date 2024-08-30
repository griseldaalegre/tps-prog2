package tp3;

import java.util.ArrayList;

public class E2Fabrica {

    private ArrayList<E2Producto> productosDisponibles;

    public E2Fabrica() {
        this.productosDisponibles = new ArrayList<E2Producto>();
    }

    public void addProducto(E2Producto producto) {
        this.productosDisponibles.add(producto);
    }

    public double precioTotalVenta() {
        double precioVenta = 0;
        for(int i = 0;i < this.productosDisponibles.size(); i++) {
            precioVenta += productosDisponibles.get(i).getCosto() * (1 + productosDisponibles.get(i).getPorcentajeDeGanancia());
        }
        return precioVenta;
    }

    public double precioTotalCosto() {
        double precioCosto = 0;
        for(int i = 0;i < this.productosDisponibles.size(); i++) {
            precioCosto += productosDisponibles.get(i).getCosto();
        }
        return precioCosto;
    }
}
