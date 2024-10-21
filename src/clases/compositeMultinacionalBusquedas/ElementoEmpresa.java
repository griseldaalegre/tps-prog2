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


    //devuelve la lista de empleados ordenadas


}
