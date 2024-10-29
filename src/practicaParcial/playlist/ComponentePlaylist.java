package practicaParcial.playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import practicaParcial.playlist.condiciones.Condicion;

public abstract class ComponentePlaylist {
    private String titulo;

    public ComponentePlaylist(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract int getCantidadDeVideos();

    public abstract int getDuracion();

    public abstract ArrayList<String> getPalabrasClaves();

    public abstract ArrayList<Video> buscar(Condicion c);// este va a buscar comun

    public ArrayList<Video> buscar(Condicion c, Comparator<Video> orden) {
        ArrayList<Video> resultado = this.buscar(c);// le paso la condicion
        Collections.sort(resultado, orden);
        return resultado;
    }



}
