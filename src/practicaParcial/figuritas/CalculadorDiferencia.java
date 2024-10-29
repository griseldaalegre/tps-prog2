package practicaParcial.figuritas;

public class CalculadorDiferencia extends Calculador {
    private double valorInicial;

    public CalculadorDiferencia(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    public double calcular(FiguritaEdicionLimitada f) {
        return this.valorInicial - f.getUnidadesDisponibles();
    }
}
