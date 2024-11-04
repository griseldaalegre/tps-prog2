package practicaParcial.presupuesto;

public class CalculadorXDias extends CalculadorCosto {
    private double valorDia;

    public CalculadorXDias(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public double calculadorCosto(PresupuestoBasico b) {
        return valorDia * b.getTiempoEstimado();
    }
}
