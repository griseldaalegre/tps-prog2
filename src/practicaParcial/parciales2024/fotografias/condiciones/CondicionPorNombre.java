package practicaParcial.parciales2024.fotografias.condiciones;

import practicaParcial.parciales2024.fotografias.Fotogafia;

public class CondicionPorNombre extends Condicion {
    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Fotogafia f) {
        return f.tieneAPersona(nombre);//preguntar
    }
}
