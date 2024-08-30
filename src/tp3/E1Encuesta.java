package tp3;

import java.util.ArrayList;

public class E1Encuesta {
    private ArrayList<String> listaPreguntas;
    private E1Empleado encuestador;
    private E1Empleado empleado;
    private int dniEncuestado;
    private int numeroEncuesta;

    public E1Encuesta(E1Empleado encuestador, E1Empleado encuestado, int dniEncuestado, int numeroEncuesta) {
        this.encuestador = encuestador;
        this.empleado = empleado;
        this.dniEncuestado = dniEncuestado;
        this.numeroEncuesta = numeroEncuesta;
        this.listaPreguntas = new ArrayList<String>();
    }

    public E1Empleado getEncuestador() {
        return encuestador;
    }

    public void setEncuestador(E1Empleado encuestador) {
        this.encuestador = encuestador;
    }

    public E1Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(E1Empleado empleado) {
        this.empleado = empleado;
    }

    public int getDniEncuestado() {
        return dniEncuestado;
    }

    public void setDniEncuestado(int dniEncuestado) {
        this.dniEncuestado = dniEncuestado;
    }

    public int getNumeroEncuesta() {
        return numeroEncuesta;
    }

    public void setNumeroEncuesta(int numeroEncuesta) {
        this.numeroEncuesta = numeroEncuesta;
    }
}

