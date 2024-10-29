package practicaParcial.parciales2021.hotelera;

public class Turista {
    private String nombre;
    private String ciudadOrigen;
    private int edad;

    public Turista(String ciudadOrigen, int edad) {
        this.ciudadOrigen = ciudadOrigen;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
