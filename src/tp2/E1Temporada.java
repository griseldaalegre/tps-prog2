package tp2;

import java.util.ArrayList;

public class E1Temporada {
    private ArrayList<E1Episodio> cantEpisodios;

    public E1Temporada() {
        this.cantEpisodios = new ArrayList<E1Episodio>();
    }

    public int totalEpisodiosVistos() {
        int cant = 0;
        for (int i = 0; i < this.cantEpisodios.size(); i++) {
            if (this.cantEpisodios.get(i).isFlag()) {
                cant++;
            }
        }
        return cant;
    }

    public void addEpisodio(E1Episodio episodio) {
        cantEpisodios.add(episodio);
    }

    public double promedioCalificaciones() {
        int calificacion = 0;
        int cantidadVistos = 0;
        for (int i = 0; i < this.cantEpisodios.size(); i++) {
            if (this.cantEpisodios.get(i).isFlag()) {
                calificacion += this.cantEpisodios.get(i).getCalificacion();
                cantidadVistos++;
            }
        }
        if (cantidadVistos != 0) {
            return (double) calificacion / cantidadVistos;
        } else {
            return 0;
        }
    }

    public boolean episodiosVistos() {
        int i = 0;
        while( i < this.cantEpisodios.size()) {
            if(!this.cantEpisodios.get(i).isFlag()) {
                return false;
            }
            i++;
        } return true;
    }
}
