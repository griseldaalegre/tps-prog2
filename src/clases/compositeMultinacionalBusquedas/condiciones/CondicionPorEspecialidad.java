package clases.compositeMultinacionalBusquedas.condiciones;

import clases.compositeMultinacionalBusquedas.Empleado;

public class CondicionPorEspecialidad extends Condicion {
    private String especialidad;

    public CondicionPorEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean cumple(Empleado e) {
        return e.getEspecialidad().equals(especialidad);
    }
}
