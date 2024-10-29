package practicaParcial.figuritas;


public class CalculadorProducto extends Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorProducto(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(FiguritaEdicionLimitada f) {
        return c1.calcular(f) * c2.calcular(f);
    }
}
