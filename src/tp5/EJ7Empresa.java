package tp5;

import java.util.ArrayList;

public class EJ7Empresa {
    private ArrayList<EJ7Empleado> empleados;

    public EJ7Empresa() {
        this.empleados = new ArrayList<EJ7Empleado>();
    }

    public void addEmpleado(EJ7Empleado empleado) {
        this.empleados.add(empleado);
    }

    public double gastosEnSueldo(){
        double totalSueldo= 0;
        for(int i = 0; i <empleados.size(); i++){
            totalSueldo+= this.empleados.get(i).getSueldo();
        }
        return totalSueldo;
    }
}
