package clases.compositeMultinacional.comparadores;

import clases.compositeMultinacional.Empleado;

import java.util.Comparator;

public class ComparadorInverso implements Comparator<Empleado> {
    //guardo otro comparador
    private Comparator<Empleado> directo;

    public ComparadorInverso(Comparator<Empleado> directo) {
        this.directo = directo;
    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        //lo que me de otro comparador lo tengo q invertir
        return -directo.compare(o1, o2);
        //negar
    }
}
