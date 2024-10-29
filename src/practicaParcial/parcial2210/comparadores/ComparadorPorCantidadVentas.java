package practicaParcial.parcial2210.comparadores;

import practicaParcial.parcial2210.Vendedor;

import java.util.Comparator;

public class ComparadorPorCantidadVentas implements Comparator<Vendedor> {
    @Override
    public int compare(Vendedor o1, Vendedor o2) {
        return o1.cantidadVentasTotales() - o2.cantidadVentasTotales();//restar siempre q son enteros
    }
}
