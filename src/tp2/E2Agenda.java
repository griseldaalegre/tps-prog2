package tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class E2Agenda {
    private E2Usuario duenio;
    private ArrayList<E2Reunion> reuniones;

    public E2Agenda(E2Usuario duenio) {
        this.duenio = duenio;
        this.reuniones = new ArrayList<E2Reunion>();
    }

    public E2Usuario getDuenio() {
        return duenio;
    }

    public void setDuenio(E2Usuario duenio) {
        this.duenio = duenio;
    }

    public void addReunion(E2Reunion reunion) {
        boolean agregarReunion = true;
        int i = 0;
        while (i < this.reuniones.size()) {
            E2Reunion r1 = reuniones.get(i);
            //si coiciden no las puedo agregar
            if (r1.choca(reunion)) {
                agregarReunion = false;

            }
        }
        if (agregarReunion) {
            reuniones.add(reunion);
        }
    }

    public int cantidadReunicones() {
        return reuniones.size();
    }

    public int cantidadReunicones(LocalDate fecha) {
        int suma = 0;
        for (int i = 0; i < reuniones.size(); i++) {
            E2Reunion r1 = reuniones.get(i);
            if (fecha.equals(r1.getFecha())) {
                suma++;
            }
        }
        return suma;
    }


}
