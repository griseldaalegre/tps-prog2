package practicaParcial.presupuesto;

public class CalculadorCostoFijo extends CalculadorCosto {
    private double valor;

    public CalculadorCostoFijo(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculadorCosto(PresupuestoBasico b) {
        return valor;
    }

}
