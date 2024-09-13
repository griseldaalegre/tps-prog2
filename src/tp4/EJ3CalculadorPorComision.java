package tp4;

public class EJ3CalculadorPorComision extends EJ3CalculadorDeSueldo {
    private double comision;
    private double ventas;

    public EJ3CalculadorPorComision(double sueldoFijo, double comision, double ventas) {
        super(sueldoFijo);
        this.comision = comision;
        this.ventas = ventas;
    }

    @Override
    //sobre escrio el metodoo
    public double calcularSueldo() {
        //llamo al metodo del padre,
        return super.calcularSueldo() + (this.ventas * this.comision);
    }
}
