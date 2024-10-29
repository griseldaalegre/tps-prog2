package practicaParcial.parcial2210.comparadores;
import java.util.Comparator;
import practicaParcial.parcial2210.ComponenteVenta;

public class ComparadorPorEdades implements Comparator<ComponenteVenta> {
    public int compare(ComponenteVenta o1, ComponenteVenta o2) {
        return o1.getPromedioEdad() - o2.getPromedioEdad();
    }
}
