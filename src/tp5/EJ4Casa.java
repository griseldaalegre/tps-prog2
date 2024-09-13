package tp5;

import java.util.ArrayList;

public class EJ4Casa {
    protected ArrayList<String> cualidades;
    protected ArrayList<EJ4Alumno> residentes;
    protected int maxAlumnos;

    public EJ4Casa(int maxAlumnos) {
        this.cualidades = new ArrayList<>();
        this.residentes = new ArrayList<EJ4Alumno>();
        this.maxAlumnos = maxAlumnos;
    }

    public void setCualidad(String cualidad) {
        this.cualidades.add(cualidad);
    }

    public boolean casaLlena() {
        return this.residentes.size() >= maxAlumnos;
    }

    public String agregarResidente(EJ4Alumno alumno) {
        if (!casaLlena() && cumpleRequisitos(alumno)) {
            this.residentes.add(alumno);
            return "Se agrego";
        }
        return "No cumple requisios";
    }

    public boolean cumpleRequisitos(EJ4Alumno alumno) {
        int i = 0;
        while (i < this.cualidades.size()) {
            if (alumno.tieneCualidad(this.cualidades.get(i)) && !alumno.isTieneCasa()) {
                this.residentes.add(alumno);
                alumno.setTieneCasa(true);
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
}
