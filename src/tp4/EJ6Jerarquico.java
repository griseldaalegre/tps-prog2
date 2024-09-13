package tp4;

import java.util.ArrayList;

public class EJ6Jerarquico extends EJ6Empleado {
    private ArrayList<EJ6Empleado> listaEmpleadosACargo;

    public EJ6Jerarquico(String nombre, String apellido, int edad, String numeroLegajo, double sueldo, String cargo) {
        super(nombre, apellido, edad, numeroLegajo, sueldo, cargo);
        this.listaEmpleadosACargo = new ArrayList<EJ6Empleado>();
    }

    public void addEmpleado(EJ6Empleado empleado) {
        this.listaEmpleadosACargo.add(empleado);
    }

    @Override
    public String toString() {
        return "Cargo: Jerárquico\n" +
                "Nombre: " + getNombre() + " " + getApellido() + "\n" +
                "Edad: " + getEdad();
    }

}
