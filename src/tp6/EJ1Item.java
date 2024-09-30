package tp6;

public abstract class EJ1Item {

    private String nombre;

    public EJ1Item(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean cumple();
}
