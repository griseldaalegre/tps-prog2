package practicaParcial.parciales2021.libreria.condiciones;

import practicaParcial.parciales2021.libreria.ComponenteLibreria;

public class CondicionPorVolumenMenor extends Condicion {
    private int volumenMenor;

    public CondicionPorVolumenMenor(int volumenMenor) {
        this.volumenMenor = volumenMenor;
    }

    @Override
    public boolean cumple(ComponenteLibreria c) {
        return c.getVolumen() > this.volumenMenor;
    }
}
