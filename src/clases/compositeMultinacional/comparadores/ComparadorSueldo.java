package clases.compositeMultinacional.comparadores;

import clases.compositeMultinacional.Empleado;

import java.util.Comparator;

//esta clase va a comparar sueldos y ordenarlos, implementando la interface comparator

public class ComparadorSueldo implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int) (o1.gastoSueldo() - o2.gastoSueldo());
        //cuando quiero comparar valores num la forma mas facil es devolver la resta
    }

    //si da > 0 es pq el primero es > al segundo
    //si da 0 < es pq al segundo es > al primero
    // si da 0 son iguales
}
