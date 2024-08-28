package tp2;

import java.util.ArrayList;

public class E1Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<E1Temporada> cantTemporadas;

    public E1Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.cantTemporadas = new ArrayList<E1Temporada>();
    }

    public void addTemporada(E1Temporada temporada) {
        this.cantTemporadas.add(temporada);
    }

    public int totalEpisodiosVistosXSerie() {
        int cant = 0;
        for (int i = 0; i < this.cantTemporadas.size(); i++) {
          cant += this.cantTemporadas.get(i).totalEpisodiosVistos();
        }
        return cant;
    }

    public boolean seVioLaTodaSerie() {
        int i = 0;
        while(i < this.cantTemporadas.size()) {
            if(!this.cantTemporadas.get(i).episodiosVistos()) {
                return false;
            }
            i++;
        }
        return true;
    }
}
