package tp7.streaming.condiciones;

import tp7.streaming.Pelicula;

public class CondicionPorDuracionMenorA extends Condicion {
    private int minutos;

    public CondicionPorDuracionMenorA(int minutos) {
        this.minutos = minutos;
    }

    public boolean cumple(Pelicula p) {
        return p.getDuracion() < this.minutos;
    }
}
