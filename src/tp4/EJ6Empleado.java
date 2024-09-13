package tp4;

public class EJ6Empleado extends EJ6Persona {
    private String numeroLegajo;
    private double sueldo;
    private String cargo;

    public EJ6Empleado(String nombre, String apellido, int edad, String numeroLegajo, double sueldo, String cargo) {
        super(nombre, apellido, edad);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Cargo: Empleado\n" +
                "Nombre: " + getNombre() + " " + getApellido() + "\n" +
                "Edad: " + getEdad();
    }
}
