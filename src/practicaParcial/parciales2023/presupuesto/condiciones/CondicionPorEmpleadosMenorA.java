package practicaParcial.presupuesto.condiciones;

import practicaParcial.presupuesto.ComponentePresupuesto;

public class CondicionPorEmpleadosMenorA extends Condicion {
    private int cantidadEmpleados;

    public CondicionPorEmpleadosMenorA(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public boolean cumple(ComponentePresupuesto c) {
        return c.getCantidadEmpleados() < this.cantidadEmpleados;
    }
}
