package tp4;

public class EJ3Empleado {

    private String nombre;
    private EJ3CalculadorDeSueldo calculador;

    public EJ3Empleado(String nombre, EJ3CalculadorDeSueldo calculador) {
        this.nombre = nombre;
        this.calculador = calculador;
    }

    public void setCalculador(EJ3CalculadorDeSueldo calculador) {
        this.calculador = calculador;
    }

    public double getSueldo() { // Candidato a moverse
        return calculador.calcularSueldo();
    }

}
