package practicaParcial.presupuesto;

public class CalculadorSuma extends CalculadorCosto {
    private CalculadorCosto c1;
    private CalculadorCosto c2;

    public CalculadorSuma(CalculadorCosto c1, CalculadorCosto c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public CalculadorCosto getC1() {
        return c1;
    }

    public void setC1(CalculadorCosto c1) {
        this.c1 = c1;
    }

    public CalculadorCosto getC2() {
        return c2;
    }

    public void setC2(CalculadorCosto c2) {
        this.c2 = c2;
    }

    @Override
    public double calculadorCosto(PresupuestoBasico b) {
        return c1.calculadorCosto(b) + c2.calculadorCosto(b);
    }
}
