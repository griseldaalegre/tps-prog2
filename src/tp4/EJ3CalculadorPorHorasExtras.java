package tp4;

public class EJ3CalculadorPorHorasExtras extends EJ3CalculadorDeSueldo {
    private double valorHora;
    private int horasTrabajadas;

    public EJ3CalculadorPorHorasExtras(double sueldoFijo, double valorHora, int horasTrabajadas) {
        super(sueldoFijo);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (valorHora * horasTrabajadas);
    }
}
