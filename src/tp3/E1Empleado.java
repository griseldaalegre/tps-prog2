package tp3;

public class E1Empleado {
    private String nombre;
    private int dni;
    private double sueldo;

    public E1Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = 200;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
