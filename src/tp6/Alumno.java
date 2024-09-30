package tp6;

public class Alumno implements EJ3ElementoCola {
    private String nombre;
    private int legajo;

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public boolean esMayor(EJ3ElementoCola otro) {
        return this.getLegajo() > ((Alumno) otro).getLegajo();
    }
}
