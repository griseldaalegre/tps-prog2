package tp5;

public class EJ7Vendedor extends EJ7Empleado {
    private double extraVenta;
    private double comision;

    public EJ7Vendedor(String nombre, String apellido, String dni, double sueldo, double extraVenta, double comision) {
        super(nombre, apellido, dni, sueldo);
        this.extraVenta = extraVenta;
        this.comision = comision;
        setSueldo(sueldo);  // Llamar a setSueldo() en el constructor

    }

    public double getExtraVenta() {
        return extraVenta;
    }

    public void setExtraVenta(double extraVenta) {
        this.extraVenta = extraVenta;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void setSueldo(double sueldo) {
        double sueldoConExtra = sueldo + (getExtraVenta() * (getComision() / 100));
        super.setSueldo(sueldoConExtra);  // Uso el metodo del padre
    }
}
