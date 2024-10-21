package tp11.futbol5.comparadores;

import tp11.futbol5.Socio;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Socio> {
    public int compare(Socio o1, Socio o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
