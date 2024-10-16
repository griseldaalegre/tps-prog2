package clases.compositeMultinacional;

import java.util.ArrayList;

//Objeto padre de simple y compuesto;
//Puede ser una interfaz
public interface ElementoEmpresa {
    //Servicios
    public int cantidadEmpleados();

    public double gastoSueldo();

    public ArrayList<Empleado> empleadosCon(String especialidad);

}
