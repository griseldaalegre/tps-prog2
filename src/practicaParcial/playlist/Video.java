package practicaParcial.playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import practicaParcial.playlist.condiciones.Condicion;

public class Video extends ComponentePlaylist implements Comparable<Video> {
    private Usuario usuario;
    private int cantidadVideo;
    private int duracion;
    private int visualizaciones;
    private int meGusta;
    private int noMegusta;
    private LocalDate anioPublicacion;
    private ArrayList<String> palabrasClaves;

    public Video(String titulo, Usuario usuario, int cantidadVideo, int duracion, int visualizaciones,
                 int meGusta, int noMegusta, LocalDate anioPublicacion) {
        super(titulo);
        this.usuario = usuario;
        this.cantidadVideo = cantidadVideo;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.meGusta = meGusta;
        this.noMegusta = noMegusta;
        this.anioPublicacion = anioPublicacion;
        this.palabrasClaves = new ArrayList<String>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCantidadVideo(int cantidadVideo) {
        this.cantidadVideo = cantidadVideo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getNoMegusta() {
        return noMegusta;
    }

    public void setNoMegusta(int noMegusta) {
        this.noMegusta = noMegusta;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void addPalabraClave(String palabra) {
        if (!this.palabrasClaves.contains(palabra)) {
            this.palabrasClaves.add(palabra);
        }
    }

    public boolean tienePalabraClave(String palabra) {
        return this.palabrasClaves.contains(palabra);
    }

    @Override
    public int getCantidadDeVideos() {
        return 1;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(this.palabrasClaves);//retorno copia
    }

    @Override
    public ArrayList<Video> buscar(Condicion c) {
        ArrayList<Video> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        //Si elenunciado me dice q el orden no va a cambiar a futuro
        //uso: Collections.sort(resultado);
        //y la clase por la q voy a ordenar implementa Comparatable ->
        //CompareTo(Video otro) -> y compara this con otro

        Collections.sort(resultado);
        return resultado;
    }


    @Override
    public int compareTo(Video o) {
        return this.usuario.compareTo(o.getUsuario());//Comparo los usuarios
    }
}
