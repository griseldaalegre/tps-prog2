package practicaParcial.parciales2024;

public class VendedorMentiroso extends Vendedor {
    private double exagerarMonto;//BIEN

    public VendedorMentiroso(String nombre, String apellido, int edad, double exagerarMonto) {
        super(nombre, apellido, edad);
        this.exagerarMonto = exagerarMonto;
    }

    @Override
    public double getGanancias() {
        return super.getGanancias() * exagerarMonto;
    }
}
