package tp8.onePiece.condiciones;
import tp8.onePiece.Elemento;

public class CondicionPorNombre extends Condicion {

    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Elemento e) {
        return this.nombre.equals(e.getNombre());
    }

}
