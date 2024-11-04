package practicaParcial.parciales2024.condiciones;

import practicaParcial.parciales2024.Vendedor;

public class CondicionPorVentaProductosMenor extends Condicion {
    private int cantidadProductos;

    public CondicionPorVentaProductosMenor(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public boolean cumple(Vendedor v) {
        return v.cantidadProductosVendidos() < this.cantidadProductos;
    }
}
