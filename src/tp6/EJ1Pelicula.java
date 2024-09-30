package tp6;

public class EJ1Pelicula extends EJ1Item {
    private int cantidadCopias;
    private String director;

    public EJ1Pelicula(String nombre, int cantidadCopias, String director) {
        super(nombre);
        this.cantidadCopias = cantidadCopias;
        this.director = director;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean cumple() {
        return getCantidadCopias() > 0;
    }

}
