package clases.compositeMultinacional;

import java.util.ArrayList;

//Compisite: Cuando hay objetos compuestos y simples;
public class Empleado implements ElementoEmpresa{
    //Objeto empleado representa al simple;
    private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String apellido, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public double gastoSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList resultado = new ArrayList<>();
        if (this.getEspecialidad().equals(especialidad)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Empleado empleado = (Empleado) obj; // al parametro lo trato como un grupo
            return this.getNombre().equals(empleado.getNombre())
                    && this.getApellido().equals(empleado.getApellido());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int cantidadEmpleados() {
        return 1;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
