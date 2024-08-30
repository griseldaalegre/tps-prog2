package tp3;

import java.time.LocalDate;
import java.time.Period;

public class EJ4Contacto {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String numeroTelefono;
    private String direccion;
    private String direccionImail;

    public EJ4Contacto(String nombre, String apellido, LocalDate fechaNacimiento,
                       String numeroTelefono, String direccion, String direccionImail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.direccionImail = direccionImail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionImail() {
        return direccionImail;
    }

    public void setDireccionImail(String direccionImail) {
        this.direccionImail = direccionImail;
    }

    public int getEdad() {
        LocalDate hoy = LocalDate.now(); // Fecha actual
        return Period.between(this.fechaNacimiento, hoy).getYears(); // Diferencia en años
    }

    @Override
    public String toString() {
        return "Contacto [\n" +
                "  Nombre=" + this.getNombre() + ",\n" +
                "  Apellido=" + this.getApellido() + ",\n" +
                "  Número=" + this.getNumeroTelefono() + ",\n" +
                "  fabricante=" + this.getEdad() + ",\n" +
                "]";
    }

}
