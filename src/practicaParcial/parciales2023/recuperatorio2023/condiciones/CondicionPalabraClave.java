package practicaParcial.parciales2023.recuperatorio2023.condiciones;

import practicaParcial.parciales2023.recuperatorio2023.ComponenteAcademia;

public class CondicionPalabraClave extends Condicion {
    private String palabra;

    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public boolean cumple(ComponenteAcademia c) {
        return c.contienePalabra(palabra);
    }
}
