package practicaParcial.parciales2024.comparadores;

import practicaParcial.parciales2024.Vendedor;

import java.util.Comparator;

//BIEN
public class ComparadorPorCantidadVentas implements Comparator<Vendedor> {
    @Override
    public int compare(Vendedor o1, Vendedor o2) {
        return o1.cantidadVentasTotales() - o2.cantidadVentasTotales();//restar siempre q son enteros
    }
}
