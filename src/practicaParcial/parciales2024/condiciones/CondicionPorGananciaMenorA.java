package practicaParcial.parciales2024.condiciones;

import practicaParcial.parciales2024.Vendedor;

public class CondicionPorGananciaMenorA extends Condicion {
    private double ganancia;

    public CondicionPorGananciaMenorA(double ganancia) {

        this.ganancia = ganancia;
    }

    @Override
    public boolean cumple(Vendedor v) {
        return v.getGanancias() < this.ganancia;
    }
}
