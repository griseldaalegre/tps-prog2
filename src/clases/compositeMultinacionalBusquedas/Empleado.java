package clases.compositeMultinacionalBusquedas;

import clases.compositeMultinacionalBusquedas.condiciones.Condicion;

import java.util.ArrayList;

//Compisite: Cuando hay objetos compuestos y simples;
public class Empleado extends ElementoEmpresa {
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
    public ArrayList<Empleado> empleadosCon(Condicion c) {
        ArrayList resultado = new ArrayList<>();
        if (c.cumple(this)) { //EN LA ESTRUCTURA SIMPLE SI SE PUEDE HACER UN IF
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public ElementoEmpresa copia() { //devuelvo una copia de este objeto
        return new Empleado(this.getNombre(), this.getApellido(), this.getEspecialidad(), this.gastoSueldo());
    }

    @Override//compuestos sin hijos
    public ElementoEmpresa copiaRestringida(Condicion c) {
        if (c.cumple(this)) {//si este empleado cumplecon la condicion lo copio
            return new Empleado(this.getNombre(), this.getApellido(), this.getEspecialidad(), this.gastoSueldo());
        }
        return null; //SI NO CUMPLO

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
