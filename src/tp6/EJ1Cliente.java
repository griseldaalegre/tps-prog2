package tp6;

public class EJ1Cliente {
    private String nombre;

    public EJ1Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente [\n" +
                "  Nombre=" + this.getNombre() + ",\n" +
                "]";
    }
}
