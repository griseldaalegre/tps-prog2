package practicaParcial.parciales2021.libreria.condiciones;

import practicaParcial.parciales2021.libreria.ComponenteLibreria;

public class CondicionPorMarca extends Condicion {
    private String marca;

    public CondicionPorMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(ComponenteLibreria c) {
        return c.getMarca().equals(this.marca);
    }
}
