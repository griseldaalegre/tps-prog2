package clases.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Facultad {

    private ArrayList<Alumno> alumnos;

    public Facultad() {
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno a) {
        this.alumnos.add(a);
    }

    public void ordenarAlumnosPorNombre() {
        Collections.sort(alumnos); // Ordenar usando el método compareTo de Alumno
    }

    public void mostrarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}
