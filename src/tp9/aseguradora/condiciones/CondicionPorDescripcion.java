package tp9.aseguradora.condiciones;

import tp9.aseguradora.ComponenteSeguro;

public class CondicionPorDescripcion extends Condicion {
    private String descripcion;

    public CondicionPorDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean cumple(ComponenteSeguro seguro) {
        return seguro.getDescripcion().contains(this.descripcion);
    }
}