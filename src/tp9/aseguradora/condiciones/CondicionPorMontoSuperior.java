package tp9.aseguradora.condiciones;

import tp9.aseguradora.ComponenteSeguro;

public class CondicionPorMontoSuperior extends Condicion {
    private double monto;

    public CondicionPorMontoSuperior(double monto) {
        this.monto = monto;
    }

    public boolean cumple(ComponenteSeguro seguro) {
        return seguro.getMontoAsegurado() > this.monto;
    }
}
