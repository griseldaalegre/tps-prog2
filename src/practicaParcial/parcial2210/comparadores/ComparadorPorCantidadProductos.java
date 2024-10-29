package practicaParcial.parcial2210.comparadores;
import practicaParcial.parcial2210.Vendedor;

import java.util.Comparator;

public class ComparadorPorCantidadProductos implements Comparator<Vendedor> {
    public int compare(Vendedor o1, Vendedor o2) {
        return o1.cantidadProductosVendidos() - o2.cantidadProductosVendidos();
    }
}
