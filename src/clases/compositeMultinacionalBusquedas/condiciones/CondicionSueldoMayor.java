package clases.compositeMultinacionalBusquedas.condiciones;

import clases.compositeMultinacionalBusquedas.Empleado;

public class CondicionSueldoMayor extends Condicion {
    private double valorMinimo;

    public CondicionSueldoMayor(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }


    @Override
    public boolean cumple(Empleado e) {
        return e.gastoSueldo() > valorMinimo;
    }
}
