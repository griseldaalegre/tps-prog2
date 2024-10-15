package clases.compositeMultinacional;

import java.util.ArrayList;

//este empleado siempre se va a incluir sin importar q especialidad se pida
public class EmpleadoEstrella extends Empleado {
    public EmpleadoEstrella(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }

    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> respuesta = new ArrayList<>();
        respuesta.add(this);
        return respuesta;
    }
}
