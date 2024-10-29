package practicaParcial.parcial2210;

public class VendedorMentiroso extends Vendedor {
    private double exagerarMonto;

    public VendedorMentiroso(String nombre, String apellido, int edad, double exagerarMonto) {
        super(nombre, apellido, edad);
        this.exagerarMonto = exagerarMonto;
    }

    @Override
    public double getGanancias() {
        return super.getGanancias() * exagerarMonto;
    }
}
