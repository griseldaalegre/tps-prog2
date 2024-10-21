package tp9.aseguradora.condiciones;

import tp9.aseguradora.ComponenteSeguro;

public class CondicionPorDni extends Condicion {
    private String dni;

    public CondicionPorDni(String dni) {
        this.dni = dni;
    }

    public boolean cumple(ComponenteSeguro seguro) {
        return seguro.getDniAsegurado().equals(dni);
    }
}
