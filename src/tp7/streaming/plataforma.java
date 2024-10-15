package tp7.streaming;

import tp7.streaming.condiciones.Condicion;

import java.util.ArrayList;

public class plataforma {
    private String nombrePlataforma;
    private ArrayList<Pelicula> catalogoPeliculas;

    public plataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
        this.catalogoPeliculas = new ArrayList<Pelicula>();
    }

    public void addPelicula(Pelicula p) {
        if (!this.catalogoPeliculas.contains(p)) {
            this.catalogoPeliculas.add(p);
        }
    }

    public void deletePelicula(Pelicula p) {
        this.catalogoPeliculas.remove(p);
    }

    public ArrayList<Pelicula> buscar(Condicion c) {
        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula peli : catalogoPeliculas) {
            if (c.cumple(peli)) {
                resultado.add(peli);
            }
        }
        return resultado;
    }

    public boolean esRentable(Pelicula pelicula, Condicion condicionRentable) {
        return condicionRentable.cumple(pelicula);
    }

}
