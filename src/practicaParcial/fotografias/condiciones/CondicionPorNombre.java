package practicaParcial.fotografias.condiciones;

import practicaParcial.fotografias.ElementoFoto;
import practicaParcial.fotografias.Fotogafia;

public class CondicionPorNombre extends Condicion {
    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Fotogafia f) {
        return f.tieneAPersona(nombre);//preguntar
    }
}
