package practicaParcial.parciales2024.comparadores;

import java.util.Comparator;

import practicaParcial.parciales2024.ComponenteVenta;

public class ComparadorPorEdades implements Comparator<ComponenteVenta> {
    public int compare(ComponenteVenta o1, ComponenteVenta o2) {
        int v1 = o1.cantidadVentasTotales();
        int v2 = o2.cantidadVentasTotales();

        return Double.compare(v1 / o1.getPromedioEdad(), v2 / o2.getPromedioEdad());
    }
}
