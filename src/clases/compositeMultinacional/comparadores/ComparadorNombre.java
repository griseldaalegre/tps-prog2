package clases.compositeMultinacional.comparadores;
import clases.compositeMultinacional.Empleado;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        //obtengo el apelldo y uso el compareTo de comparable q esta implementada en la claseString
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
