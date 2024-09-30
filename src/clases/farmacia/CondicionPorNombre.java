package clases.farmacia;

public class CondicionPorNombre extends Condicion{
    private String nombre;

    public boolean cumple(Medicamento m) {
        return m.getNombre().contains(this.nombre);
    }
}
