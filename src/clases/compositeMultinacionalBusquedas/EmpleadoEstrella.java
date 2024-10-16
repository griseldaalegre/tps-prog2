package clases.compositeMultinacionalBusquedas;

import clases.compositeMultinacionalBusquedas.condiciones.Condicion;

import java.util.ArrayList;

//este empleado siempre se va a incluir sin importar q especialidad se pida
public class EmpleadoEstrella extends Empleado {
    public EmpleadoEstrella(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }

    @Override
    public ArrayList<Empleado> empleadosCon(Condicion c) {
        ArrayList<Empleado> respuesta = new ArrayList<>();
        respuesta.add(this);
        return respuesta;
    }

    @Override
    public ElementoEmpresa copia() { //devuelvo una copia de este objeto
        return new EmpleadoEstrella(this.getNombre(), this.getApellido(), this.getEspecialidad(), this.gastoSueldo());
    }
}
