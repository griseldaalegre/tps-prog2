package clases.compositeMultinacionalBusquedas;

import clases.compositeMultinacionalBusquedas.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//Objeto padre de simple y compuesto;
//Puede ser una interfaz
public abstract class ElementoEmpresa {
    //Servicios
    public abstract int cantidadEmpleados();

    public abstract double gastoSueldo();

    public abstract ArrayList<Empleado> empleadosCon(Condicion condicion);

    public abstract ElementoEmpresa copia();

    public abstract ElementoEmpresa copiaRestringida(Condicion c);

    public ArrayList<Empleado> empleadosCon(Condicion condicion, Comparator<Empleado> c) {
        ArrayList temp = this.empleadosCon(condicion);
        Collections.sort(temp, c);//ordena segun cualquier criterio
        return temp;
    }

    //devuelve la lista de empleados ordenadas


}
