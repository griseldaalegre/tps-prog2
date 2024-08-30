package tp3;

import java.util.ArrayList;

public class E1Compania {
    private ArrayList<E1Encuesta> encuestasRealizadas;
    private ArrayList<E1Empleado> listaEmpleados;

    public E1Compania() {
        this.encuestasRealizadas = new ArrayList<E1Encuesta>();
        this.listaEmpleados = new ArrayList<E1Empleado>();
    }

    public String addEncuestaRealizada(E1Encuesta encuesta) {
        if (yaRealizoEncuesta(encuesta)) {
            return "El empleado ya realizó esta encuesta";
        } else {
            this.encuestasRealizadas.add(encuesta);
            return "Encuesta agregada";
        }
    }

    public void addEmpleado(E1Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    public boolean yaRealizoEncuesta(E1Encuesta encuesta) {
        int i = 0;

        while (i < this.encuestasRealizadas.size()) {
            if (this.encuestasRealizadas.get(i).getDniEncuestado() == encuesta.getDniEncuestado()
                    && this.encuestasRealizadas.get(i).getNumeroEncuesta() == encuesta.getNumeroEncuesta()
            ) {
                return true;
            } else {
                i++;
            }

        }
        return false;
    }

    public int contadorEncuestasRealizadas(E1Empleado empleado) {
        int contador = 0;
        for (int i = 0; i < this.encuestasRealizadas.size(); i++) {
            if (this.encuestasRealizadas.get(i).getDniEncuestado() == empleado.getDni()) {
                contador++;
            }
        }
        return contador;
    }

    public void pagarBonus(E1Empleado empleado) {
        int bonus = contadorEncuestasRealizadas(empleado);
        double sueldoActual = empleado.getSueldo() + bonus;
        empleado.setSueldo(sueldoActual);
    }

}
