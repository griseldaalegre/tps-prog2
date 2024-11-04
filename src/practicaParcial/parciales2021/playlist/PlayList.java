package practicaParcial.parciales2021.playlist;

import practicaParcial.parciales2021.playlist.condiciones.Condicion;

import java.util.ArrayList;

public class PlayList extends ComponentePlaylist {
    private int duracionExtra;
    protected ArrayList<ComponentePlaylist> elementos;

    public PlayList(String titulo, int duracionExtra) {
        super(titulo);
        this.duracionExtra = duracionExtra;
        this.elementos = new ArrayList<>();
    }

    public int getDuracionExtra() {
        return duracionExtra;
    }

    public void setDuracionExtra(int duracionExtra) {
        this.duracionExtra = duracionExtra;
    }

    public void addElementos(ComponentePlaylist elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public int getCantidadDeVideos() {
        int resultado = 0;
        for (ComponentePlaylist elemento : elementos) {
            resultado += elemento.getCantidadDeVideos();
        }
        return resultado;
    }

    @Override
    public int getDuracion() {
        int resultado = 0;
        for (ComponentePlaylist elemento : elementos) {
            resultado += elemento.getDuracion();
        }
        return resultado;
    }

    //SIN REPETIDOS
    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ComponentePlaylist elemento : elementos) {
            ArrayList<String> auxliar = new ArrayList<>(elemento.getPalabrasClaves());// HAGO UNA COPIA DE MI ARREGLO Y LO RECORRO
            for (String palabra : auxliar) {
                if (!resultado.contains(palabra)) {
                    resultado.add(palabra);
                }
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList<Video> resultado = new ArrayList<>();
        for (ComponentePlaylist elemento : elementos) {
            resultado.addAll(elemento.buscar(c));
        }
        return resultado;
    }
}
