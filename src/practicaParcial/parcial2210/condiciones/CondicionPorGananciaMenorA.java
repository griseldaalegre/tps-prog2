package practicaParcial.parcial2210.condiciones;

import practicaParcial.parcial2210.Vendedor;

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
