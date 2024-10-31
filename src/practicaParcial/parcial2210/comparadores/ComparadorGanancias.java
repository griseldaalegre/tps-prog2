package practicaParcial.parcial2210.comparadores;

import practicaParcial.parcial2210.Vendedor;

import java.util.Comparator;

public class ComparadorGanancias implements Comparator<Vendedor> {
    public int compare(Vendedor o1, Vendedor o2) {
        //como devuevo un doble se lo delego a DOUBLE
        double d1 = o1.getGanancias();
        double d2 = o2.getGanancias();
        return Double.compare(d1, d2);
    }
}
