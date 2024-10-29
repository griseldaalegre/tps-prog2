package practicaParcial.figuritas;

public class CalculadorFijo extends Calculador {
    private double precio;

    public CalculadorFijo(double precio) {
        this.precio = precio;
    }


    @Override
    public double calcular(FiguritaEdicionLimitada f) {
        return this.precio;
    }
}
