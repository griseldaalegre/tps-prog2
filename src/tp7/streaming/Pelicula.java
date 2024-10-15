package tp7.streaming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String director;
    private LocalDate anioEstreno;
    private int duracion;
    private int edadMinima;
    private ArrayList<String> generos;
    private ArrayList<String> actores;


    public Pelicula(String titulo, String sinopsis, String director, LocalDate anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.generos = new ArrayList<String>();
        this.actores = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(LocalDate anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean tieneGenero(String genero) {
        return this.generos.contains(genero.toUpperCase());
    }

    public ArrayList<String> mostrarGeneros() {
        return new ArrayList<>(generos); //copa
    }

    public void addGenero(String genero) {
        if (!this.generos.contains(genero.toUpperCase())) {
            this.generos.add(genero.toUpperCase());
        }
    }

    public void deleteGenero(String genero) {
        this.generos.remove(genero.toUpperCase());
    }

    public boolean tieneActor(String actor) {
        return this.actores.contains(actor.toUpperCase());
    }

    public void addActor(String actor) {
        if (!this.actores.contains(actor.toUpperCase())) {
            this.generos.add(actor.toUpperCase());
        }
    }

    public void deleteActor(String actor) {
        this.actores.remove(actor.toUpperCase());
    }

    public ArrayList<String> mostrarReparto() {
        return new ArrayList<>(actores);
    }

    @Override
    public boolean equals(Object o) {
        try {
            Pelicula pelicula = (Pelicula) o;
            return titulo.equals(pelicula.getTitulo()) && director.equals(pelicula.getDirector())
                    && anioEstreno.equals(pelicula.getAnioEstreno());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", director='" + director + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", duracion=" + duracion +
                ", actores=" + actores +
                ", generos=" + generos +
                '}';
    }
}
