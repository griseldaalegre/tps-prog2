package clases.compositeMultinacional.comparadores;

import clases.compositeMultinacional.Empleado;

import java.util.Comparator;

//va a comparar 2 objetos con 2 criterios
public class ComparadorCompuesto implements Comparator<Empleado> {
    private Comparator<Empleado> c1;
    private Comparator<Empleado> c2;

    public ComparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(Empleado o1, Empleado o2) {
        int res = c1.compare(o1, o2);//compara c1 con o2
        if (res == 0 && c2 != null) { //si son iguales o c2 es null
            return c2.compare(o1, o2); //
        }
        return res;//si no dio 0
    }

}